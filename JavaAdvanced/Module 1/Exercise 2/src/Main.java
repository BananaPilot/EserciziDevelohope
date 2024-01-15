public class Main {
  public static void main(String[] args) {
    Character character = '2';
    checkIfNumber(character);
  }

  public static void checkIfNumber(Character element) {
    if (Character.isDigit(element)){
      System.out.println("the character is a number " + element);
    } else {
      throw new ArithmeticException("The element is not a number/ inserted character: " + element);
    }
  }
}
