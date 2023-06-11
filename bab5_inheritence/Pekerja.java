package TugasPraktikum5;

import java.time.LocalDate;

// class Pekerja
public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    private double bonus;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double pendapatan, double gaji, int jumlahAnak, int tahun, int bulan, int hari){
        super(nama, jenisKelamin, nik, menikah, pendapatan);
        this.gaji = gaji;
        tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.jumlahAnak = jumlahAnak;
        getGaji();
    }

    public void setGaji(double gaji){
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tm){
        this.tahunMasuk = tm;
    }

    public void setJumlahAnak(int ja){
        this.jumlahAnak = ja;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getGaji(){
        double TunjanganAnak = jumlahAnak * 20;
        getBonus();
        double total = TunjanganAnak + bonus + gaji;
        super.setTunjangan(total);
        super.getPendapatan();
        return gaji;
    }

    public LocalDate getTahunMasuk(){
        return tahunMasuk;
    }

    public int getJumlahAnak(){
        return jumlahAnak;
    }

    public double getBonus(){
        bonus = 0;
        int lamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if(lamaBekerja < 5){
            bonus += (0.05 * gaji);
        }
        else if(5 < lamaBekerja && lamaBekerja < 10){
            bonus += (0.1 * gaji);
        }
        else if(lamaBekerja > 10){
            bonus += (0.15 * gaji);
        }

        return bonus;
    }

    public String toString(){
        return super.toString() + "\n" + "tahun masuk : " + tahunMasuk + "\n" + "jumlah anak : " + jumlahAnak + "\n" + "gaji : " + getGaji();
    }
}
