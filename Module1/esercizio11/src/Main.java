public class Main {
  public static void main(String[] args) {
    int a = 10;
    int b = 10;
    if (isDifferent(a, b)) {
      System.out.printf("%d and %d are different", a, b);
    } else {
      System.out.printf("%d and %d are equal", a, b);
    }
  }

  public static boolean isDifferent(int a, int b){
    return a != b;
  }
}