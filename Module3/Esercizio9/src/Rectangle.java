public class Rectangle extends Shape{

  private int height;
  private int width;

  public Rectangle(int height, int width){
    super(TypeOfShape.Rectangle);
    this.height = height;
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public int getArea() {
    return width * height;
  }
}
