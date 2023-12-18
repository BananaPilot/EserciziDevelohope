public class Car {
  private int CC;
  private String plate;
  private String brand;
  private  String model;

  public Car(int CC, String plate, String brand, String model){
    this.CC = CC;
    this.plate = plate;
    this.brand = brand;
    this.model = model;
  }

  public int getCC() {
    return CC;
  }

  public String getPlate() {
    return plate;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public void setCC(int CC) {
    this.CC = CC;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getValues(){
    return "CC: " + CC + " Plate number: " + plate + " Brand: " + brand + " Model: " + model;
  }
}
