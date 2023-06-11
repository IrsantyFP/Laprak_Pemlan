package TugasPraktikum5;

public class Main {
    public static void main(String[] args) {
        System.out.println("===================================");
        Manusia m1 = new Manusia("budi", true, "111", true, 25.0);  
        System.out.println(m1.toString());
        System.out.println();

        System.out.println("===================================");
        Manusia m2 = new Manusia("wati", false, "2222", true, 30.0);
        System.out.println(m2.toString());
        System.out.println();

        System.out.println("===================================");
        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("Puput", false, "4444", false, 20.0, "225150400111011", 2.8);
        System.out.println(mhs1.toString());
        System.out.println();

        System.out.println("===================================");
        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("Puput", false, "4444", false, 20.0, "225150400111011", 3.4);
        System.out.println(mhs2.toString());
        System.out.println();

        System.out.println("===================================");
        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("Puput", false, "4444", false, 20.0, "225150400111011", 3.8);
        System.out.println(mhs3.toString());
        System.out.println();

        System.out.println("===================================");
        Pekerja p1 = new Pekerja("Setiawan", true, "5555", true, 0 , 4000, 2, 2021, 4, 2);
        System.out.println(p1.toString());
        System.out.println();

        System.out.println("===================================");
        Pekerja p2 = new Pekerja("Nana", false, "6666", false, 0, 5000, 0, 2014, 2, 2);
        System.out.println(p2.toString());
        System.out.println();

        System.out.println("===================================");
        Pekerja p3 = new Pekerja("Heri", true, "1111", true, 0, 10000, 10, 2003, 1, 25);
        System.out.println(p3.toString());
        System.out.println();

        System.out.println("===================================");
        Manager manajer = new Manager("Wawan", true, "7777", false, 0, 7500, 0, "Logistik", 2008, 3, 23);
        System.out.println(manajer.toString());
        System.out.println();

        System.out.println("===================================");
    }
}
