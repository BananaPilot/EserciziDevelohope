public class Triangle implements Shape{
  private int base;
  private int height;
  public Triangle(int base, int height){
    this.base = base;
    this.height = height;
  }

  public int getHeight() {
    return height;
  }

  public int getBase() {
    return base;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setBase(int base) {
    this.base = base;
  }

  @Override
  public int getArea() {
    return (base * height) / 2;
  }
}
