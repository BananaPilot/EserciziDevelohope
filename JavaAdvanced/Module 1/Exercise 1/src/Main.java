public class Main {
  public static void main(String[] args) {
    int input = 20;
    int min = 0;
    int max = 20;
    try {
      if (input > min && input < max) {
        System.out.println(true);
      } else {
        throw new ArithmeticException("Number must be in range");
      }
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
  }
}
