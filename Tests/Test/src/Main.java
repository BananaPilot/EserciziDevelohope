import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    long a = 0;
    long b = 1;
    long result = 0;
    for (int i = 0; i < 100; i++) {
      result = a + b;
      a = b;
      b = result;
      System.out.println(result);
    }
  }
}
