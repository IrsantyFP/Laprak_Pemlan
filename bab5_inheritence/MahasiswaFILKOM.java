package TugasPraktikum5;

// class MahasiswaFILKOM
public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;
    double beasiswa;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, double pendapatan, String nim, double ipk){
        super(nama, jenisKelamin, nik, menikah, pendapatan);
        this.nim = nim;
        this.ipk = ipk;
        getBeasiswa();
        super.setTunjangan(beasiswa);
        super.getPendapatan();
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setIpk(double ipk){
        this.ipk = ipk;
    }

    public String getNim(){
        return nim;
    }

    public double getIpk(){
        return ipk;
    }

    public String getStatus(){
        int angkatan = Integer.parseInt(nim.substring(0, 2)) + 2000;
        String prodi;

        switch (prodi = nim.substring(6, 7)){
            case "2":
                prodi = "Teknik Informatika";
                break;
            case "3":
                prodi = "Teknik Komputer";
                break;
            case "4":
                prodi = "Sistem Informasi";
                break;
            case "6":
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case "7":
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Prodi tidak ada";
        }

        return prodi + ", " + angkatan;
    }

    public double getBeasiswa(){
        if(3.0 < ipk && ipk < 3.5){
            beasiswa = beasiswa + 50;
        }
        else if(3.5 < ipk && ipk < 4.0){
            beasiswa = beasiswa + 75;
        }
        
        return beasiswa;
    }

    public String toString(){
        return super.toString() + "\n" + "nim : " + nim + "\n" + "IPK : " + ipk + "\n" + "Status : " + getStatus();
    }
}