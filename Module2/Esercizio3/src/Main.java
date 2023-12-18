public class Main {
  public static void main(String[] args) {
    Car car1 = new Car(12, "XD123XD", "Fiat", "Panda 4x4");
    System.out.printf("CC: %d Plate number: %s Brand: %s Model: %s", car1.getCC(), car1.getPlate(), car1.getBrand(), car1.getModel());
  }
}
