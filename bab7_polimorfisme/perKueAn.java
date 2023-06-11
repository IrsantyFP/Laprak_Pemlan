package Praktikum8_poli;

//class perKueAn
public class perKueAn {
    public static void main(String[] args) {
        Kue[] kue2an = new Kue[20];

        //Array 20 kue
        kue2an[0] = new KuePesanan("Bomboloni", 2000, 500);
        kue2an[1] = new KueJadi("Donat", 3500, 5);
        kue2an[2] = new KuePesanan("Muffin", 4000, 200);
        kue2an[3] = new KueJadi("Muffin keju", 4000, 5);
        kue2an[4] = new KuePesanan("Kue coklat", 3000, 250);
        kue2an[5] = new KueJadi("Pancake coklat", 2500, 4);
        kue2an[6] = new KuePesanan("Muffin oreo", 4000, 150);
        kue2an[7] = new KueJadi("Donat kentang", 2500, 10);
        kue2an[8] = new KuePesanan("Kue sus", 3000, 150);
        kue2an[9] = new KueJadi("Brownies", 5000, 10);
        kue2an[10] = new KuePesanan("Kue lapis", 2500, 400);
        kue2an[11] = new KueJadi("Kue sus coklat", 3000, 8);
        kue2an[12] = new KuePesanan("Kue lumpur", 3500, 200);
        kue2an[13] = new KueJadi("Martabak", 4000, 6);
        kue2an[14] = new KuePesanan("Kue kukus", 2500, 600);
        kue2an[15] = new KueJadi("Croissant", 4500, 5);
        kue2an[16] = new KuePesanan("Cheesecake", 5000, 200);
        kue2an[17] = new KueJadi("Kue stroberi", 3000, 15);
        kue2an[18] = new KuePesanan("Kue bluberi", 4000, 100);
        kue2an[19] = new KueJadi("Millie Crepe", 12000, 3);

        //tampilkan semua kue dan jenisnya
        System.out.println("Daftar kue : ");
        for(Kue kue : kue2an){
            if(kue != null){
                System.out.println(kue.toString());
            }
        }

        //hitung total harga yang didapat dari semua jenis kue
        double total = 0;
        for(Kue kue : kue2an){
            if(kue != null){
                total = total + (int)kue.hitungHarga();
            }
        }
        System.out.println("\nTotal harga semua jenis kue : " + total);

        //hitung total harga dan total berat kuePesanan
        double totalHargaKP = 0;
        double totalBerat = 0;
        for(Kue kue : kue2an){
            if(kue instanceof KuePesanan){
                KuePesanan kuePesanan = (KuePesanan) kue;
                totalHargaKP = totalHargaKP + kuePesanan.getHarga();
                totalBerat = totalBerat + kuePesanan.getBerat();
            }
        }

        System.out.println("\nTotal harga kue pesanan : Rp " + totalHargaKP);
        System.out.println("Total berat kue pesanan yang terjual : " + totalBerat);

        //hitung total harga dan total jumlah dari kueJadi
        double totalHargaKJ = 0;
        double totalJumlah = 0;
        for(Kue kue : kue2an){
            if(kue instanceof KueJadi){
                KueJadi kueJadi = (KueJadi) kue;
                totalHargaKJ = totalHargaKJ + kueJadi.getHarga();
                totalJumlah = totalJumlah + kueJadi.getJumlah();
            }
        }

        System.out.println("\nTotal harga kue jadi : Rp " + totalHargaKJ);
        System.out.println("Total jumlah kue jadi yang terjual : " + totalJumlah);

        //Tampilkan informasi kue dengan harga(harga akhir) terbesar
        Kue kueTerbesar = null;
        double hargaTerbesar = 0;
        for(Kue kue : kue2an){
            if(kue != null && kue.hitungHarga() > hargaTerbesar){
                hargaTerbesar = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        if(kueTerbesar != null){
            System.out.println("\nKue dengan harga terbesar : " + kueTerbesar.toString());
        }
    
    }
}
