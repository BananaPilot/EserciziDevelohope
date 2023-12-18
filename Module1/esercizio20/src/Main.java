public class Main {
  public static void main(String[] args) {
    printInverseList(10, 5);
  }

  public static void printInverseList(int start, int limit){
    for(int i = limit; i > 0; i--){
      System.out.println(start);
      start--;
    }
  }
}