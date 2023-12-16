public class Animal {
  private String color;
  private String sound;
  private int numberOfLimbs;
  private int numberOfEyes;
  private boolean canSwim;
  private boolean canFly;

  public Animal(int numberOfLimbs, int numberOfEyes, boolean canSwim, boolean canFly){
    this.numberOfLimbs = numberOfLimbs;
    this.numberOfEyes = numberOfEyes;
    this.canSwim = canSwim;
    this.canFly = canFly;
  }

  public String getColor() {
    return color;
  }

  public String getSound() {
    return sound;
  }

  public int getNumberOfLimbs() {
    return numberOfLimbs;
  }

  public int getNumberOfEyes() {
    return numberOfEyes;
  }

  public boolean getCanFly() {
    return canFly;
  }

  public boolean getCanSwim() {
    return canSwim;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public void setNumberOfLimbs(int numberOfLimbs) {
    this.numberOfLimbs = numberOfLimbs;
  }

  public void setNumberOfEyes(int numberOfEyes) {
    this.numberOfEyes = numberOfEyes;
  }

  public void setCanSwim(boolean canSwim) {
    this.canSwim = canSwim;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }

  public void makeSound(){
    System.out.println(sound);
  }
}

