public class Main {
  public static void main(String[] args) {
    getMultiplicationTable(5);
  }

  public static void getMultiplicationTable(int number){
    for(int i = 0; i <= 10; i++){
      System.out.println(number * i);
    }
  }
}