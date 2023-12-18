public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(10, 5);
    Triangle triangle = new Triangle(10, 9);
    System.out.println("The area of the " + rectangle.getType() + " is: " + rectangle.getArea());
    System.out.println("The area of the " + triangle.getType() + " is: " + triangle.getArea());
  }
}
