package bab8_abstract;

// kelas Car
public class Car extends Vehicle {
    // buat variabel owner yang bertipe data Owner
    private Owner owner;
    private String name;
    private int year;
    private double rpm;
    
    Car(Owner owner, String name, int year, double rpm) {
      this.owner = owner;
      this.name = name;
      this.year = year;
      this.rpm = rpm;
    }
  
    public void showData() {
      System.out.println("Car name\t: " + this.name);
      System.out.println("Car owner\t: " + this.owner.getName());
      System.out.println("Output year\t: " + this.year);
      System.out.println("RPM\t\t: " + this.rpm);
    }
}
