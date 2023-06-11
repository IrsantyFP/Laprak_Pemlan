package Praktikum8_poli;

//class KuePesanan
public class KuePesanan extends Kue{
    private double berat;

    KuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }

    KuePesanan(){

    }

    public void setBerat(double berat){
        this.berat = berat;
    }

    public double getBerat(){
        return berat;
    }

    public double hitungHarga(){
        return getHarga() * getBerat();
    }

    public String toString(){
        return super.toString() + "\nJenis kue : Kue pesanan"
        + "\nBerat : " + getBerat() + " g"
        + "\nHarga total : Rp " + hitungHarga(); 

    }
}
