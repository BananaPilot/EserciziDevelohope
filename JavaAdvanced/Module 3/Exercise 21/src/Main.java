import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student("Fabio", 23), new Student("Alfredo", 30)));
    System.out.println(students);

    students.add(new Student("Simona", 27));
    students.add(new Student("Marco", 25));
    students.add(new Student("Pasquale", 22));
    students.add(new Student("Simon", 32));

    System.out.println(students);
  }
}
