public class Human extends Primate {
  private String name;
  private String surname;
  private int age;
  private String mainHabitat;
  private String status;
  private boolean isAdult;

  public Human(String name, String surname, int age, String status){
    super(true, true, new String[]{"Mangrove", "Mountain", "Rainforest", "Savanna", "Semi-arid", "Urban"});
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.mainHabitat = getHabitat()[5];
    this.status = status;
    this.isAdult = setAdult();
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public int getAge() {
    return age;
  }

  public String getMainHabitat() {
    return mainHabitat;
  }

  public String getStatus() {
    return status;
  }

  public boolean isAdult() {
    return isAdult;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setMainHabitat(String mainHabitat) {
    this.mainHabitat = mainHabitat;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public boolean setAdult() {
    return age >= 18;
  }

  public void speak(String word){
    setSound(word);
    makeSound();
  }
}
