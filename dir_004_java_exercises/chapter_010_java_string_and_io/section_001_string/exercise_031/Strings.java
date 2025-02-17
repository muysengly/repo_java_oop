//MIT License: https://bit.ly/35gZLa3
public final class Strings {

  private Strings() {
    throw new AssertionError("Cannot be instantiated");
  }

  public static String removeWhitespaces(String str) {

    if (str == null || str.isEmpty()) {
      // or throw IllegalArgumentException
      return "";
    }

    return str.replaceAll("\\s", "");
  }

}
