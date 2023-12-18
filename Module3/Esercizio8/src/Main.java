public class Main {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(10, 9);
    Rectangle rectangle = new Rectangle(10, 5);
    System.out.println("The area of the triangle is: " + triangle.getArea());
    System.out.println("The area of the rectangle is: " + rectangle.getArea());
  }
}
