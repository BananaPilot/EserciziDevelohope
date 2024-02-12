public class Main {
  public static void main(String[] args) {
    try {
      Util util = new Util();
      System.out.println(util.findAndDevideByZero(new double[]{1, 2, 3, 4, 5}, 5, 0));
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}


class Util{
  public double findAndDevideByZero(double[] numbers, double numberToFind, double div) {
    if (div <= 0) throw new ArithmeticException("divisor must be grater than 0");
    for(double number: numbers) {
      if (number == numberToFind){
        return number / div;
      }
    }
    throw new ArrayStoreException("Number not found. Number to find: " + numberToFind);
  }
}


