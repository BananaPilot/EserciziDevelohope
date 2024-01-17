import org.junit.Test;

public class StudentTest {

  @Test
  public void getName() {
    String name = "Fabio";
    System.out.println(name);
  }

  @Test
  public void getAge() {
    int age = 23;
    System.out.println(age);
  }

  @Test
  public void setName() {
    getName();
  }

  @Test
  public void setAge() {
    getAge();
  }
}