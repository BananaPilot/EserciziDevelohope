import java.util.Arrays;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    System.out.println(hashSet.size());
    for(Integer number : hashSet){
      System.out.println(number);
    }
  }
}
