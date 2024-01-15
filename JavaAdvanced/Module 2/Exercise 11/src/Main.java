import java.util.ArrayList;

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
    //Mettere in ordine la collezione e stampare il risultato -?> cosa mi sta a significare?
  }
}
