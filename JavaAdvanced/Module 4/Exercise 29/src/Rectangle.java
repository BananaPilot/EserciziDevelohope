public class Rectangle implements Shape{
  private double height;
  private double base;

  public Rectangle(double height, double base) {
    this.height = height;
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  @Override
  public double getArea() {
    return base * height;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
            "height=" + height +
            ", base=" + base +
            '}';
  }
}
