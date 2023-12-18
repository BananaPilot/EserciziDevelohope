public class Main {
  public static void main(String[] args) {
    System.out.println(addTwo(10, 5));
  }

  public static int addTwo(int a, int b){
    int selectedValue = 5;

    a += selectedValue;
    b += selectedValue;

    return a * b;
  }
}