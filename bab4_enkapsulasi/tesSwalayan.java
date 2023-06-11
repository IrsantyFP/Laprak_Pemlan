package praktikum4;
import java.util.Scanner;

public class tesSwalayan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean choose = false;
        String pilihan;
        int topup, pembelian;

        pelanggan pelanggan1 = new pelanggan("Budi", "3823457648", 10000000, 4444);
        while(!choose){
            System.out.println("Pilih transaksi : ");
            System.out.println("1. TopUp");
            System.out.println("2. Pembelian");
            pilihan = input.nextLine();
            if(pilihan.equals("1")){
                if(pelanggan1.autentifikasi()==true){
                    break;
                }
                System.out.println("Masukkan nominal TopUp : ");
                topup = input.nextInt();
                pelanggan1.topup(topup);
                break;
            }else if(pilihan.equals("2")){
                if(pelanggan1.autentifikasi()==true){
                    break;
                }
                System.out.println("Masukkan nominal total pembelian : ");
                pembelian = input.nextInt();
                pelanggan1.pembelian(pembelian);
                break;
            }
            choose = false;
        }
        System.out.println("===================================================");

        pelanggan pelanggan2 = new pelanggan("poet", "5622222222", 12000000, 2222);
        while(!choose){
            System.out.println("Pilih transaksi : ");
            System.out.println("1. TopUp");
            System.out.println("2. Pembelian");
            pilihan = input.nextLine();
            if(pilihan.equals("1")){
                if(pelanggan2.autentifikasi()==true){
                    break;
                }
                System.out.println("Masukkan nominal TopUp : ");
                topup = input.nextInt();
                pelanggan2.topup(topup);
                break;
            }else if(pilihan.equals("2")){
                if(pelanggan2.autentifikasi()==true){
                    break;
                }
                System.out.println("Masukkan nominal total pembelian : ");
                pembelian = input.nextInt();
                pelanggan2.pembelian(pembelian);
                break;
            }
            choose = false;
        }
        System.out.println("===================================================");


        pelanggan pelanggan3 = new pelanggan("Broudi", "7499999999", 5000000, 6666);
        while(!choose){
            System.out.println("Pilih transaksi : ");
            System.out.println("1. TopUp");
            System.out.println("2. Pembelian");
            pilihan = input.nextLine();
            if(pilihan.equals("1")){
                if(pelanggan1.autentifikasi()==true){
                    break;
                }
                System.out.println("Masukkan nominal TopUp : ");
                topup = input.nextInt();
                pelanggan1.topup(topup);
                break;
            }else if(pilihan.equals("2")){
                if(pelanggan1.autentifikasi()==true){
                    break;
                }
                System.out.println("Masukkan nominal total pembelian : ");
                pembelian = input.nextInt();
                pelanggan1.pembelian(pembelian);
                break;
            }
            choose = false;
        }
        System.out.println("===================================================");


    }
}
