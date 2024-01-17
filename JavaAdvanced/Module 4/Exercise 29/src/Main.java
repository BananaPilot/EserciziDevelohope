public class Main {
  public static void main(String[] args) {
    System.out.println(draw(Shapes.CIRCLE));
  }

  public static Shape draw(Shapes shape) {
    return ShapeFactory.createShape(shape);
  }
}
