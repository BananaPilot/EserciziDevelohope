public class Main {
  public static void main(String[] args) {
    int min = 0;
    int max = 10;
    System.out.printf("result:%b min:%d max:%d", isInRange(5, min, max), min, max);
  }

  public static boolean isInRange(int number, int min, int max){
    return number > min && number < max;
  }
}
