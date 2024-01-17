public class User {
  private String name;
  private String surname;
  private int age;

  public User(String name, String surname, int age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
  }

  public static User getUser(){
    
  }

  private String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  private String getSurname() {
    return surname;
  }

  private void setSurname(String surname) {
    this.surname = surname;
  }

  private int getAge() {
    return age;
  }

  private void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            '}';
  }
}
