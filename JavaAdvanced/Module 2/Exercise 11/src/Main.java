import java.util.ArrayList;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    System.out.println(students);
    for (int i = 20; i <= 32; i ++){
      if (i <= 26){
        students.add(new Student("Fabio", i));
      } else {
        students.add(new Student("Alfredo", i));
      }
    }
    System.out.println(students);
    students.sort(new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
      }
    });
    System.out.println(students);
  }
}
