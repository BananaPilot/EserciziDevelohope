import java.util.Collections;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<Fruit> fruits = new LinkedList<>();
    Collections.addAll(fruits, new Fruit("Banana"), new Fruit("Apple"), new Fruit("Pineapple"), new Fruit("Apricot"));
    System.out.println(fruits);
    fruits.addFirst(new Fruit("Peach"));
    fruits.addLast(new Fruit("Mango"));
    System.out.println(fruits);
  }
}
