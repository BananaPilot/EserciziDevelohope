public abstract class Shape {
  private final TypeOfShape type;
  public Shape(TypeOfShape type){
    this.type = type;
  }

  public TypeOfShape getType() {
    return type;
  }

  public abstract int getArea();
}
