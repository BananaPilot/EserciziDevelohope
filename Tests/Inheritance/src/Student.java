public class Student extends Human {
  private int ID;
  private String major;
  private int[] grades;
  private float average;
  public Student(String name, String surname, int age, String status, int ID, String major, int[] grades) {
    super(name, surname, age, status);
    this.ID = ID;
    this.major = major;
    this.grades = grades;
    this.average = setAverage(grades);
  }

  public int getID() {
    return ID;
  }

  public String getMajor() {
    return major;
  }

  public int[] getGrades() {
    return grades;
  }

  public float getAverage() {
    return average;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public void setGrades(int[] grades) {
    this.grades = grades;
  }

  public float setAverage(int[] grades) {
    int sum = 0;
    for(int grade : grades){
      sum += grade;
    }
    return (float) sum / grades.length;
  }
}
