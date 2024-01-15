public class Main {
  public static void main(String[] args) {
    double number = 5;
    double res = devideForZero(number);
    if(Double.isInfinite(res)){
      throw new ArithmeticException("Numbers can't devide by 0");
    } else {
      System.out.println(res);
    }
  }

  public static double devideForZero(double number) {
    return number / 0;
  }
}
