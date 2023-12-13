public class Student {
  private String name;

  private  String surname;

  private int ID;

  public Student(String name, String surname, int ID){
    this.name = name;
    this.surname = surname;
    this.ID = ID;
  }

  public int getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  @Override
  public String toString(){
    return "name: " + name + " surname: " + surname + " ID: " + ID;
  }
}
