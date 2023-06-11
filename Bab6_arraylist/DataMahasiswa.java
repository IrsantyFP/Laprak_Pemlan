// Irsanty Fitriyana Putri - 225150400111011 - SI-B
package Bab6_arraylist;

import java.util.ArrayList;

class DataMahasiswa {

  private static ArrayList<Mahasiswa> mhs = new ArrayList<>();
  private static Mahasiswa mahasiswa1 = new Mahasiswa();

  public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa addMhs){
    mhs.add(addMhs);
    return mhs;
  }

  public static void tampilSemuaData(){
    for(int i = 0 ; i<mhs.size() ; i++){
      System.out.println("=== Tampilkan Data Mahasiswa " + (i+1) + " Filkom UB ===");
      System.out.println("Nama Mahasiswa  : " + mhs.get(i).getName());
      System.out.println("Jurusan         : " + mhs.get(i).getJurusan());
      System.out.println("Status          : " + mhs.get(i).getStatus());
      System.out.println();
    }
  }

  public static Mahasiswa cariMahasiswa(String nama){
    System.out.println("=== Pencarian Data Mahasiswa ===");
    for(Mahasiswa mahasiswa1 : mhs){
      if(mahasiswa1.getName().equals(nama)){
        System.out.println("Data mahasiswa atas nama " + nama + " ditemukan");
        System.out.println();
        return mahasiswa1;
      }
    }
    System.out.println("Data mahasiswa atas nama " + nama + " tidak ditemukan");
    System.out.println();
    return mahasiswa1;
  }

  public static void tampilMahasiswa(Mahasiswa mahasiswa1){
    System.out.println("=== Informasi Mahasiswa ===");
    System.out.println("Nama Mahasiswa  : " + mahasiswa1.getName());
    System.out.println("Jurusan         : " + mahasiswa1.getJurusan());
    System.out.println("Status          : " + mahasiswa1.getStatus());
    System.out.println();
  }

  public static void updateMahasiswa(String nama, String jurusan, boolean status ,Mahasiswa updateBaru){
    updateBaru.setNama(nama);
    updateBaru.setJurusan(jurusan);
    updateBaru.setStatus(status);
  }
}

