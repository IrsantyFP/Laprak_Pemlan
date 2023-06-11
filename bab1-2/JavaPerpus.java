public class JavaPerpus {
    public static void main(String[] args) {
        Perpus b1 = new Perpus();
        b1.setJudul("A History of science technology and philosophy in the eighteenth century");
        b1.setKategori("Teknologi");
        b1.setPenulis("McKie, D.");
        b1.setPenerbitan("LondonGeorge Allen & Unwin Ltd 1952");
        b1.setBahasa("Inggris");
        b1.setEdisi("Kedua");
        b1.setHalaman(814);
        b1.setSinopsis("Buku ini membahas berbagai tema dan tokoh yang penting dalam sejarah sains, teknologi, dan filsafat pada abad ke-18");
        b1.setPenjualan(10);
        b1.hitungRoyalti(40000);
        b1.displayMessage();
        System.out.println("=====================================");

        Perpus b2 = new Perpus();
        b2.setJudul("Information and Communication Technology,dan Literasi Media Digital");
        b2.setKategori("Teknologi");
        b2.setPenulisbanyak(new String[]{"Dewi Kartika Sari", "Nurul Hasfi", "Hedi Pudjo Santosa", "Triyono Lukmantoro", "Narayana Mahendra Prastya", "Santi Isnaini", "Said Romadlan", "Sa’diyah El Adawiyah", "Suwarto", "Aminah Swarnawati", "AgungPrabowo", "Kurnia Arofah", "Sri Budi Lestari", "Edi antoso","M as’Amah"});
        b2.setPenerbitan("ASPIKOM 2015");
        b2.setBahasa("Indonesia");
        b2.setEdisi("Pertama");
        b2.setHalaman(178);
        b2.setSinopsis("Buku ini menjelaskan secara rinci mengenai berbagai aspek TIK, termasuk komputer, internet, perangkat mobile, dll");
        b2.setPenjualan(34);
        b2.hitungRoyalti(50000, 5);
        b2.displayMessage();
        System.out.println("=====================================");
        
        Perpus b3 = new Perpus();
        b3.setJudul("Dunia Sophie");
        b3.setKategori("Filsafat");
        b3.setPenulis("Jostein Gaarder");
        b3.setPenerbitan("Mizan Pustaka 2014");
        b3.setBahasa("Indonesia");
        b3.setEdisi("-");
        b3.setHalaman(800);
        b3.setSinopsis("Buku ini bercerita tentang seorang gadis bernama Sophie Amundsen yang tiba-tiba menerima sebuah surat misterius yang berisi pertanyaan-pertanyaan filosofis.");
        b3.setPenjualan(41);
        b3.hitungRoyalti(38000);
        b3.displayMessage();
        System.out.println("=====================================");

        Perpus b4 = new Perpus();
        b4.setJudul("Filsafat Kata");
        b4.setKategori("Filsafat");
        b4.setPenulis("Reza Alexander Antonius Wattimena");
        b4.setPenerbitan("Evolitera 2011");
        b4.setBahasa("Indonesia");
        b4.setEdisi("-");
        b4.setHalaman(396);
        b4.setSinopsis("Buku ini membahas tentang konsep-konsep dasar dalam pemahaman kita tentang kata dan bahasa.");
        b4.setPenjualan(20);
        b4.hitungRoyalti(49000, 5);
        b4.displayMessage();
        System.out.println("=====================================");
        
        Perpus b5 = new Perpus();
        b5.setJudul("Dinamika Pendidikan Islam: Perspektif Historis");
        b5.setKategori("Sejarah");
        b5.setPenulis("Dr. Siswanto, M.Pd.I");
        b5.setPenerbitan("Pena Salsabila 2013");
        b5.setBahasa("Indonesia");
        b5.setEdisi("-");
        b5.setHalaman(190);
        b5.setSinopsis("Buku ini membahas tentang sejarah perkembangan pendidikan Islam di Indonesia dan dunia Islam secara umum.");
        b5.setPenjualan(28);
        b5.hitungRoyalti(50000);
        b5.displayMessage();
        System.out.println("=====================================");

        Perpus b6 = new Perpus();
        b6.setJudul("Penulisan dan Penghimpunan Hadis: Kajian Historis");
        b6.setKategori("Sejarah");
        b6.setPenulis("Rasul Ja'fariyan");
        b6.setPenerbitan("Lentera 1992");
        b6.setBahasa("Indonesia");
        b6.setEdisi("Pertama");
        b6.setHalaman(100);
        b6.setSinopsis("Buku ini membahas membahas tentang sejarah penulisan dan penghimpunan hadis dalam Islam.");
        b6.setPenjualan(56);
        b6.hitungRoyalti(39000, 12);
        b6.displayMessage();
        System.out.println("=====================================");
        
        Perpus b7 = new Perpus();
        b7.setJudul("Berkata Baik atau Diam: 294 Adab Kebiasaan Rasulullah SAW.");
        b7.setKategori("Agama");
        b7.setPenulis("Ninik Handrini");
        b7.setPenerbitan("PT. Gramedia Pustaka Utama 2016");
        b7.setBahasa("Indonesia");
        b7.setEdisi("Pertama");
        b7.setHalaman(240);
        b7.setSinopsis("Buku ini membahas tentang adab-adab atau kebiasaan baik yang dilakukan oleh Nabi Muhammad SAW dalam kesehariannya.");
        b7.setPenjualan(51);
        b7.hitungRoyalti(49000);
        b7.displayMessage();
        System.out.println("=====================================");

        Perpus b8 = new Perpus();
        b8.setJudul("Ya Allah, Aku Jatuh Cinta");
        b8.setKategori("Agama");
        b8.setPenulis("Qowi Alta Az Zahra");
        b8.setPenerbitan("PT. Elex Media Komputindo 2014");
        b8.setBahasa("Indonesia");
        b8.setEdisi("Pertama");
        b8.setHalaman(116);
        b8.setSinopsis("Buku ini mengambil pendekatan Islam sebagai pandangan utama dalam memahami cinta.");
        b8.setPenjualan(60);
        b8.hitungRoyalti(59000, 12);
        b8.displayMessage();
        System.out.println("=====================================");
        
        Perpus b9 = new Perpus();
        b9.setJudul("Akhir Bahagia");
        b9.setKategori("Psikologi");
        b9.setPenulis("Sandy Oogway");
        b9.setPenerbitan("PT. Karpindo 2018");
        b9.setBahasa("Indonesia");
        b9.setEdisi("Pertama");
        b9.setHalaman(121);
        b9.setSinopsis("Buku ini bercerita tentang akhir bahagia menurut sudut pandang psikologi");
        b9.setPenjualan(43);
        b9.hitungRoyalti(45000);
        b9.displayMessage();
        System.out.println("=====================================");

        Perpus b10 = new Perpus();
        b10.setJudul("Modul Pembelajaran dan Praktikum Tes Psikologi");
        b10.setKategori("Psikologi");
        b10.setPenulis("Zainul Anwar");
        b10.setPenerbitan("Psychology Forum 2021");
        b10.setBahasa("Indonesia");
        b10.setEdisi("-");
        b10.setHalaman(60);
        b10.setSinopsis("buku panduan bagi mahasiswa psikologi yang ingin mempelajari tes psikologi.");
        b10.setPenjualan(60);
        b10.hitungRoyalti(35000, 5);
        b10.displayMessage();
        System.out.println("=====================================");
        
        Perpus b11 = new Perpus();
        b11.setJudul("Nasionalisme Indonesia Kini dan di Masa Depan");
        b11.setKategori("Politik");
        b11.setPenulis("Benedict Anderson");
        b11.setPenerbitan("Anjing Galak Penerbitan 2010");
        b11.setBahasa("Indonesia");
        b11.setEdisi("-");
        b11.setHalaman(42);
        b11.setSinopsis("Buku ini membahas tentang nasionalisme Indonesia dan bagaimana nasionalisme tersebut berkembang di masa kini dan di masa depan.");
        b11.setPenjualan(29);
        b11.hitungRoyalti(55000);
        b11.displayMessage();
        System.out.println("=====================================");
        
        Perpus b12 = new Perpus();
        b12.setJudul("Nyanyi sunyi seorang bisu: Catatan-catatan dari P. Buru");
        b12.setKategori("Politik");
        b12.setPenulis("Pramoedya Ananta Toer");
        b12.setPenerbitan("Lentera 1995");
        b12.setBahasa("Indonesia");
        b12.setEdisi("Pertama");
        b12.setHalaman(316);
        b12.setSinopsis("Buku ini berisi catatan-catatan Pramoedya selama menjadi tahanan politik di Pulau Buru dari tahun 1965 hingga 1979.");
        b12.setPenjualan(48);
        b12.hitungRoyalti(69000, 15);
        b12.displayMessage();
        System.out.println("=====================================");
        
        Perpus b13 = new Perpus();
        b13.setJudul("Laut Bercerita");
        b13.setKategori("Fiksi");
        b13.setPenulis("Leila S. Chudori");
        b13.setPenerbitan("Gramedia Pustaka Utama 2017");
        b13.setBahasa("Indonesia");
        b13.setEdisi("-");
        b13.setHalaman(390);
        b13.setSinopsis(" Buku ini mengambil latar belakang kehidupan masyarakat pesisir di Indonesia, khususnya di Jawa Timur dan Sumatera Selatan.");
        b13.setPenjualan(64);
        b13.hitungRoyalti(55000);
        b13.displayMessage();
        System.out.println("=====================================");
        
        Perpus b14 = new Perpus();
        b14.setJudul("Seperti Dendam, Rindu Harus Dibayar Tuntas");
        b14.setKategori("Fiksi");
        b14.setPenulis("Eka Kurniawan");
        b14.setPenerbitan("Gramedia Pustaka Utama 2019");
        b14.setBahasa("Indonesia");
        b14.setEdisi("-");
        b14.setHalaman(257);
        b14.setSinopsis("Novel ini mengisahkan dua tokoh utama yang saling berhadapan dalam permainan dendam dan balas dendam yang diwarnai dengan rasa rindu yang mendalam.");
        b14.setPenjualan(70);
        b14.hitungRoyalti(69000, 15);
        b14.displayMessage();
        System.out.println("=====================================");

        Perpus b15 = new Perpus();
        b15.setJudul("DILAN 1990");
        b15.setPenulis("Pidi Baiq");
        b15.simpanFile("D:/Java/Pemlan/src/perpus.txt");

        Perpus b16 = new Perpus();
        b16.bacaFile("D:/Java/Pemlan/src/perpus.txt");
        System.out.println("Judul : " + b16.getJudul());
        System.out.println("Penulis : " + b16.getPenulis());
        System.out.println("=====================================");

        System.out.println("Persentase tingkat kesamaan : " + b1.cekTingkatKesamaan(b3) + "%");
        System.out.println("Persentase tingkat kesamaan : " + b4.cekTingkatKesamaan(b6) + "%");
        System.out.println("=====================================");
    }
}

