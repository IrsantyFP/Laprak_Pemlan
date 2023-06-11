package Praktikum8_poli;

//KueJadi
public class KueJadi extends Kue{
    private double jumlah;

    KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }

    KueJadi(){

    }

    public void setJumlah(double jumlah){
        this.jumlah = jumlah;
    }

    public double getJumlah(){
        return jumlah;
    }

    public double hitungHarga(){
        return getHarga() * getJumlah() * 2;
    }

    public String toString(){
        return super.toString() + "\nJenis kue : Kue jadi"
        + "\nJumlah : " + getJumlah()
        + "\nHarga total : Rp " + hitungHarga();
    }
}
