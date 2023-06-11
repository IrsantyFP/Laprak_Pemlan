package bab4_enkapsulasi;
import java.util.Scanner;

public class pelanggan {
    private int saldo;
    private String noPelanggan;
    private String nama;
    private int pin;

    Scanner input = new Scanner(System.in);

    public pelanggan(String nama, String np, int saldo, int pin){
        this.nama = nama;
        this.noPelanggan = np;
        this.saldo = saldo;
        this.pin = pin;
    }

    public String getNama(){
        return nama;
    }

    public String getNoPelannggan(){
        return noPelanggan;
    }

    public int getSaldo(){
        return saldo;
    }

    public int getPin(){
        return pin;
    }

    public void pembelian (int total) {
        saldo = saldo - total;
        int cashback = 0;
        if ((noPelanggan.substring(0, 2)).equals("38")) {
            if (total > 1000000) {
                cashback = ((total * 5)/100);
                saldo = saldo - total + cashback;
            }
        } else if ((noPelanggan.substring(0, 2)).equals("56")) {
            if (total > 1000000) {
                cashback = ((total * 7)/100);
                saldo = saldo + cashback;
            } else {
                cashback = ((total * 2)/100);
                saldo = saldo + cashback;
            }
        } else if ((noPelanggan.substring(0, 2)).equals("74")) {
            if (total > 1000000) {
                cashback = ((total *10)/100);
                saldo = saldo + cashback;
            } else {
                cashback = ((total * 5)/100);
                saldo = saldo + cashback;
            }
        }

        if (saldo < 10000) {
            System.out.println("Saldo Anda tidak cukup.");
            saldo = saldo + total - cashback;
        } else {
            System.out.println("Transaksi berhasil.");
        }

        if (saldo > 0) {
            System.out.println("Jumlah Saldo : Rp" + saldo);
        } else {
            System.out.println("Jumlah Saldo : Rp0");
        }

        
    }

    public void topup (int topup){
        saldo += topup;
        System.out.println("Top-Up berhasil.");
        System.out.println("Saldo Anda sekarang : " + saldo);
    }

    public boolean autentifikasi(){
        boolean autentifikasi = false;
        int jumlah = 0;
        while (!autentifikasi) {
            System.out.println("Masukkan nomor pelanggan dan pin :");
            String np = input.next();
            int pin = input.nextInt();
            if ((noPelanggan.equals(np)) && (pin == pin)) {
                System.out.println("Autentifikasi berhasil");
                break;
            } else {
                jumlah++;
            }
            
            if (jumlah == 3) {
                System.out.println("Autentifikasi gagal, akun Anda telah diblokir.");
                autentifikasi = true;
                break;
            }
        }
        return autentifikasi;
    }

}

