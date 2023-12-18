public class Main {
  public static void main(String[] args) {
    System.out.println(idrateArray().length);
  }

  public static int[] idrateArray(){
    int[] numbers = new int[10];
    for(int i = 0; i < 10; i++){
      numbers[i] = i+1;
    }
    return numbers;
  }
}