public class Main {
  public static void main(String[] args) {
    Integer numerator = 10, denominator = 5;
    System.out.println(methodForStuff(numerator, denominator));
  }

  public static Integer methodForStuff(Integer numerator, Integer denominator) {
    if (denominator != null && numerator != null){
      return numerator / denominator;
    } else {
      throw new ArithmeticException("Values are null");
    }
  }
}
