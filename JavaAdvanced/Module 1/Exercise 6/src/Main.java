public class Main {
  public static void main(String[] args){
    printPrimeSum(1, 2);
    printPrimeChar('a');
    printObjSum(1, 2);
    printObjChar('a');
    Integer i = 1;
    Double d = 1.0;
    Character c = 'a';
    int i2 = i;
    double d2 = d;
    char c2 = c;
  }

  public static void printPrimeSum(int a, int b){
    System.out.println(a + b);
  }

  public static void printPrimeChar(char letter) {
    System.out.println(letter);
  }

  public static void printObjSum(Integer a, Integer b) {
    System.out.println(a + b);
  }

  public static void printObjChar(Character letter){
    System.out.println(letter);
  }
}
