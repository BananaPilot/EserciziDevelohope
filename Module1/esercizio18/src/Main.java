public class Main {
  public static void main(String[] args) {
    System.out.println(getSumUnderLimit(5));
  }

  public static int getSumUnderLimit(int limit){
    int i = 0;
    int sum = 0;
    while (i < limit) {
      sum += i;
      i++;
    }
    return sum;
  }
}