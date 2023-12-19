public class Main {
  public static void main(String[] args) {
    String word1 = "Hello world";
    String word2 = "Hello world";

    System.out.println(stringCompare(word1, word2));
  }

  public static StringBuilder stringCompare(String word1, String word2){
    StringBuilder returnValue = new StringBuilder("Le due stringhe sono");
    if (word1.equals(word2)){
      returnValue.append(" uguali");
    } else {
      returnValue.append(" differenti");
    }
    return returnValue;
  }
}

