public class Triangle extends Shape {
  private int base;
  private int height;
  public Triangle(int base, int height) {
    super(TypeOfShape.Triangle);
    this.base = base;
    this.height = height;
  }

  public int getBase() {
    return base;
  }

  public int getHeight() {
    return height;
  }

  public void setBase(int base) {
    this.base = base;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public int getArea() {
    return (base * height) / 2;
  }
}
