public class Mammal extends Animal {
  private boolean hasFur;
  private String diet;
  public Mammal(boolean hasFur, String diet){
    super(4, 2, true, true);
    this.hasFur = hasFur;
    this.diet = diet;
  }

  public boolean getHasFur() {
    return hasFur;
  }

  public String getDiet() {
    return diet;
  }

  public void setHasFur(boolean hasFur) {
    this.hasFur = hasFur;
  }

  public void setDiet(String diet) {
    this.diet = diet;
  }
}
