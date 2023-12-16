public class Main {
  public static void main(String[] args) {
    Student student = new Student("Fabio", "Petrosillo", 23, "Engaged", 1, "CS", new int[]{90, 80, 85, 95, 70, 75, 90});
    System.out.println(student.getAverage());
    student.speak("Hello World");
  }
}
