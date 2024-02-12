public class Main {
  public static void main(String[] args) {
    try {
      Divide divide = new Divide();
      System.out.println(divide.divide(5, 1));
    } catch (Exception e){
      System.err.println(e);
    }
  }
}

class Divide{
  public double divide(double number, double div){
    if (div <= 0) throw new ArithmeticException("number must be grater than 0");
    return number / div;
  }
}
