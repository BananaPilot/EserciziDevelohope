public class Main {

  public static void main(String[] args) {
    String myWord = "Hello World";
    char[] myCharArray = createArray(myWord);
    System.out.println(countInstances(myCharArray));
  }

  public static char[] createArray(String word){
    return word.toCharArray();
  }

  public static int countInstances(char[] myCharArray){
    int counter = 0;

    for (char c : myCharArray) {
      if (c == 'a') {
        counter++;
      }
    }

    return counter;
  }
}