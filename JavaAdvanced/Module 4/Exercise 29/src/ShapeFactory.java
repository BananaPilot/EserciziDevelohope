public class ShapeFactory{
  public static Shape createShape(Shapes shape) {
    return switch (shape){
      case CIRCLE -> new Circle(5);
      case SQUARE -> new Square(10);
      case RECTANGLE -> new Rectangle(5, 10);
      default -> null;
    };
  }
}
