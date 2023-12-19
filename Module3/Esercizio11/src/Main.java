public class Main {
  public static void main(String[] args) {
    String word = "Hello world";
    System.out.println(changeCharToUnicode(word, 0));
  }

  public static StringBuilder changeCharToUnicode(String word, int index){
    StringBuilder returnValue = new StringBuilder();
    returnValue.append((int)word.charAt(index));
    return returnValue;
  }
}