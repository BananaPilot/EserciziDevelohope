public class PersonBuilder {
  private String name;
  private String surname;
  private int age;
  private String address;
  public PersonBuilder(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  public PersonBuilder setAge(int age) {
    this.age = age;
    return this;
  }

  public PersonBuilder setAddress(String address) {
    this.address = address;
    return this;
  }

  public Person build() {
    return new Person(name, surname, age, address);
  }
}
