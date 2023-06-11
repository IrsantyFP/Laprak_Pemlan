package TugasPraktikum5;

//class Manusia
public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;
    private double pendapatan;
    private double tunjangan;
    private String jk;
    
    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah, double pendapatan){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
        this.pendapatan = pendapatan;

        if(jenisKelamin==true){
            jk = "Laki -laki";
        }
        else{
            jk = "Perempuan";
        }

        getTunjangan();
    }

    public void setName(String nama){
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jk){
        this.jenisKelamin = jk;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public void setMenikah(boolean mnkh){
        this.menikah = mnkh;
    }

    public String getName(){
        return nama;
    }

    public boolean getJenisKelamin(){
        return jenisKelamin;
    }
    // true = laki - laki
    // false = perempuan;

    public String getNik(){
        return nik;
    }

    public boolean getMenikah(){
        return menikah;
    }

    public void setTunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }

    public double getTunjangan(){
        if(menikah==true){
            if(jenisKelamin==true){
                tunjangan = tunjangan + 25;
            }
            else if(jenisKelamin==false){
                tunjangan = tunjangan + 20;
            }
        }
        else if(menikah==false){
            tunjangan = tunjangan + 15;
        }
        getPendapatan();

        return tunjangan;
    }

    public double getPendapatan(){
        pendapatan = pendapatan + tunjangan;
        return pendapatan;

    }

    public String toString(){
        return "\n" + "nama : " + nama + 
        "\n" + "nik : " + nik + 
        "\n" + "jenis Kelamin : " + jk + 
        "\n" + "pendapatan : $" + pendapatan;
    }
}


