// Irsanty Fitriyana Putri - 225150400111011 - SI-B

package Bab6_arraylist;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
      
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));

        // Lakukan modifikasi data tambah mahasiswa ...
        Mahasiswa m1 = new Mahasiswa("Irsanty Fitriyana", "Sistem Informasi", false);
        DataMahasiswa.tambahMahasiswa(m1);

        Mahasiswa m2 = new Mahasiswa("Siti Nur", "Teknik Komputer", false);
        DataMahasiswa.tambahMahasiswa(m2);

        Mahasiswa m3 = new Mahasiswa("Rayhan Priambodo", "Teknik Informatika", false);
        DataMahasiswa.tambahMahasiswa(m3);
      
          // Method tampilSemuaData
        DataMahasiswa.tampilSemuaData();
      
          // Method cariMahasiswa (jika data ada)
        DataMahasiswa.cariMahasiswa("Grenda Jamaludin");
      
          // Method cariMahasiswa (jika data tidak ada)
        DataMahasiswa.cariMahasiswa("Grenda Jamaludi");
      
          // Method tampilMahasiswa (sebelum diupdate)
        DataMahasiswa.tampilMahasiswa(m3);
      
          // Method tampilMahasiswa (setelah diupdate)
        Scanner input = new Scanner(System.in);
        System.out.println("=== Pembaruan Data Mahasiswa ===");

        System.out.print("Nama Mahasiswa  : ");
        String namaBaru = input.nextLine();
        System.out.print("Jurusan         : ");
        String JrsBaru = input.nextLine();
        System.out.print("Status          : ");
        Boolean statusBaru = input.nextBoolean();
        System.out.println();
        

        DataMahasiswa.updateMahasiswa(namaBaru, JrsBaru, statusBaru, m3);

        input.close();

        DataMahasiswa.tampilMahasiswa(m3);

        //DataMahasiswa.
        DataMahasiswa.tampilSemuaData();

    }
}
