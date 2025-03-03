import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
// import com.mongodb.client.MongoCollection;

import org.bson.Document;

public class mongo_db_for_student {
    public static void main(String[] args) {
        // create connection string
        String connectionString = "mongodb+srv://student:e1cft0pCWuz8RIvm@cluster0.b82bb.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        // create server api
        ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();

        // create client settings
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString)).serverApi(serverApi)
                .build();

        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {

            // get a database connection
            MongoDatabase db_itc = mongoClient.getDatabase("db_itc");
            System.out.println("Connected");

            // create a table if it does not exist
            // db_itc.createCollection("col_table");
            // System.out.println("Created.");

            // insert data
            // Document document_insert = new Document();
            // document_insert.append("name", "aaa");
            // document_insert.append("age", 20);
            // document_insert.append("password", "123456");
            // db_itc.getCollection("col_table").insertOne(document_insert);
            // System.out.println("Inserted.");

            // delete data
            Document document_delete = new Document();
            document_delete.append("name", "bbb");
            db_itc.getCollection("col_table").deleteOne(document_delete);
            System.out.println("Deleted.");

            // update one data
            // Document document_filter = new Document();
            // Document document_update = new Document();
            // document_filter.append("name", "aaa");
            // document_update.append("name", "bbb");
            // db_itc.getCollection("col_table").updateOne(document_filter,
            // new Document("$set", document_update));
            // System.out.println("Updated.");

            // find and show data
            FindIterable<Document> iterable = db_itc.getCollection("col_table").find().limit(100);
            for (Document doc : iterable) {
                System.out.println(doc.toJson());
            }
            System.out.println("Found.");

        } catch (MongoException e) {
            e.printStackTrace();
        }
    }
}
