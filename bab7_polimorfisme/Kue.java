package Praktikum8_poli;

//class Kue
public abstract class Kue {
    private String nama;
    private double harga;

    Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    Kue(){

    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public double getHarga(){
        return harga;
    }

    public abstract double hitungHarga();

    public String toString(){
        return "\nNama kue : " + getNama() + "\nHarga kue : Rp " + getHarga();
    }
}
