public class Main {
  public static void main(String[] args) {
    Car car1 = new Car(12, "XD123XD", "Fiat", "Panda 4x4");
    System.out.println(car1.getValues());
    car1.setCC(11);
    car1.setPlate("DX987DX");
    System.out.println(car1.getValues());
  }
}
