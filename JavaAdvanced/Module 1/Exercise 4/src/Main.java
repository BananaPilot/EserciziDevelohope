public class Main {
  public static void main(String[] args) {
    double[] array = {1, 2, 3, 4, 5};
    if (Double.isInfinite(findAndDevideByZero(array, 5))){
      throw new ArithmeticException("Numbers can't devide by 0");
    }
  }

  public static double findAndDevideByZero(double[] numbers, double numberToFind) {
    for(double number: numbers) {
      if (number == numberToFind){
        return number / 0;
      }
    }
    throw new ArrayStoreException("Number not found. Number to find: " + numberToFind);
  }
}


