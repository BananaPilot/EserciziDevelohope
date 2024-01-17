public class Main {
  public static void main(String[] args) {
    PersonBuilder personBuilder1 = new PersonBuilder("Fabio", "Petrosillo")
            .setAge(23)
            .setAddress("Via del conto 24");
    Person person1 = personBuilder1.build();
    PersonBuilder personBuilder2 = new PersonBuilder("Alfredo", "Castaldi")
            .setAge(30);
    Person person2 = personBuilder2.build();
    System.out.println(person1);
    System.out.println(person2);
  }
}
