public class Main {
  public static void main(String[] args) {
    String word = "Hello World";

    if (word.length() > 10) {
      System.out.println("Lunghezza maggiore di 10");
    } else if (word.length() < 10) {
      System.out.println("Lunghezza minore di 10");
    } else {
      System.out.println("Lunghezza pari a 10");
    }
  }
}