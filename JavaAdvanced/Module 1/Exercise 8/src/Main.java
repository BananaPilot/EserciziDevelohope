import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<Integer> hashSet = createAndFill();
    System.out.println(hashSet);
    int a = 11;
    hashSet.add(a);
    System.out.println(hashSet);
  }
  public static HashSet<Integer> createAndFill() {
    HashSet<Integer> hashSet = new HashSet<>();
    for(int i = 0; i <= 10; i ++){
      hashSet.add(i);
    }
    return hashSet;
  }
}
