package bab8_abstract;

import bab8_abstract.Vehicle.showData;

// kelas App
public class App {
    public static void main(String[] args) {
    
      // todo...
      Owner o1 = new Owner("Arsyad");
      Owner o2 = new Owner("Ardhan");
      Owner o3 = new Owner("Budhi");
      Owner o4 = new Owner("Galuh");

      Car car1 = new Car(o1, "Toyota GR Yaris", 2022, 6500.0);
      car1.showData();
      System.out.println();

      Car car2 = new Car(o2, "Jeep Wrangler", 1972, 6000.0);
      car2.showData();
      System.out.println();
      
      Car car3 = new Car(o3, "Mazda RX 87", 1967, 10500.0);
      car3.showData();
      System.out.println();
      
      Car car4 = new Car(o4, "Mercedes Benz 220", 1958, 5500.0);
      car4.showData();
      System.out.println();

    }
  }
