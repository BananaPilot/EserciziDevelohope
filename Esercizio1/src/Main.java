public class Main {
  public static void main(String[] args) {
    Student student1 = new Student("Fabio", "Petrosillo", 1);
    System.out.println(student1.toString());

    student1.setID(2);
    student1.setName("Alfredo");
    student1.setSurname("DelNero");

    System.out.println(student1.toString());
  }
}
