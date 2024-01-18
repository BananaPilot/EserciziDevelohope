public class Main {
  public static void main(String[] args) {
    User user = User.getUser();
    System.out.println(user);
    User user1 = User.getUser();
    user.setName("Fabio");
    user.setSurname("Petrosillo");
    user.setAge(23);
    System.out.println(user1);
  }
}
