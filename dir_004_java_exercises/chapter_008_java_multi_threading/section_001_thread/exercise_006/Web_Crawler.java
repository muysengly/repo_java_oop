import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Web_Crawler {
  private static final int MAX_DEPTH = 2; // Maximum depth for crawling
  private static final int MAX_THREADS = 4; // Maximum number of threads

  private final Set < String > visitedUrls = new HashSet < > ();

  public void crawl(String url, int depth) {
    if (depth > MAX_DEPTH || visitedUrls.contains(url)) {
      return;
    }

    visitedUrls.add(url);
    System.out.println("Crawling: " + url);

    try {
      Document document = Jsoup.connect(url).get();
      processPage(document);

      Elements links = document.select("a[href]");
      for (Element link: links) {
        String nextUrl = link.absUrl("href");
        crawl(nextUrl, depth + 1);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void processPage(Document document) {
    // Process the web page content as needed
    System.out.println("Processing: " + document.title());
  }

  public void startCrawling(String[] seedUrls) {
    ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);

    for (String url: seedUrls) {
      executor.execute(() -> crawl(url, 0));
    }

    executor.shutdown();

    try {
      executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Crawling completed.");
  }

  public static void main(String[] args) {
    // Add URLs here
    String[] seedUrls = {
      "https://example.com",
      "https://www.wikipedia.org"
    };

    Web_Crawler webCrawler = new Web_Crawler();
    webCrawler.startCrawling(seedUrls);
  }
}
