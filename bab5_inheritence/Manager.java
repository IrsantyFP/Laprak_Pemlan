package TugasPraktikum5;

// class Manager
public class Manager extends Pekerja {
    private String departemen;
    private double gaji;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double pendapatan, double gaji, int jumlahAnak, String departemen, int tahun, int bulan, int hari){
        super(nama, jenisKelamin, nik, menikah, pendapatan, gaji, jumlahAnak, tahun, bulan, hari);
        this.departemen = departemen;
        this.gaji = gaji;
    } 

    public void setDepartemen(String depart){
        this.departemen = depart;
    }

    public String getDepartemen(){
        return departemen;
    }

    public String toString(){
        double tunjanganTambahan = 0.1 * this.gaji;
        super.setTunjangan(tunjanganTambahan);
        super.getPendapatan();
        return super.toString() + "\n" + "departemen : " + departemen;
    }
}
