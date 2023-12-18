public class Main {
  public static void main(String[] args) {
    printUnilFive(10);
  }

  public static void printUnilFive(int number){
    for(int i = 0; i < number; i++){
      if (i == 5) {
        continue;
      }
      System.out.println(i);
    }
  }
}