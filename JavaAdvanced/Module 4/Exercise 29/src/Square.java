public class Square implements Shape{
  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }
  @Override
  public double getArea() {
    return side * 2;
  }

  @Override
  public String toString() {
    return "Square{" +
            "side=" + side +
            '}';
  }
}
