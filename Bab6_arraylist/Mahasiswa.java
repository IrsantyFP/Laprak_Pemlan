// Irsanty Fitriyana Putri - 225150400111011 - SI-B
package Bab6_arraylist;

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private boolean status; // true=Menikah ; false=Lajang

    // Tambahkan constructor disini ...
    public Mahasiswa (String nama, String jurusan, boolean status){
      this.nama = nama;
      this.jurusan = jurusan;
      this.status = status;

    }

    Mahasiswa(){

    }
  
    // Tambahkan method setter & getter disini ...
    public void setNama(String nama){
      this.nama = nama;
    }

    public void setJurusan(String jurusan){
      this.jurusan = jurusan;
    }

    public void setStatus(boolean stat){
      this.status = stat;
    }

    public String getName(){
      return nama;
    }

    public String getJurusan(){
      return jurusan;
    }

    public String getStatus(){
      if(status==true){
        return "Menikah";
      }
      else{
        return "Lajang";
      }
    }
  }
