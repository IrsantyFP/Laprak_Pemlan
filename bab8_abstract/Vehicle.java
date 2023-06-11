package bab8_abstract;

// kelas Vehicle
public abstract class Vehicle {
    // buat variabel nama, tahun, dan rpm
    private String name;
    private int year;
    private double rpm;

    public void Vehicle(String name, int year, double rpm){
      this.name = name;
      this.year = year;
      this.rpm = rpm;
    }

    public void Vehicle(){

    }

    public void setName(String name){
      this.name = name;
    }

    public void setTahun(int year){
      this.year = year;
    }

    public void setRpm(double rpm){
      this.rpm = rpm;
    }

    public String getName(){
      return name;
    }

    public int getTahun(){
      return year;
    }

    public double getRpm(){
      return rpm;
    }

    // buat sebuah method abstrak yang nantinya akan di override oleh class Car
    public abstract class showData{

    }
  }
