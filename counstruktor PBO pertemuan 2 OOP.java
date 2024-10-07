class Mahasiswa {
    String Nama;
    String NIM;
    String Prodi;
    Integer umur;
    Double IPK;

    
    Mahasiswa(String InputNama, String InputNIM, String InputProdi, Integer InputUmur, Double InputIPK) {
        Nama = InputNama;
        NIM = InputNIM;
        Prodi = InputProdi;
        umur = InputUmur;
        IPK = InputIPK;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        // Membuat objek Mahasiswa menggunakan konstruktor
        Mahasiswa mhs_1 = new Mahasiswa("Putra", "23241091", "PTI", 21, 4.0);

        
        System.out.println("Nama : " + mhs_1.Nama);
        System.out.println("NIM : " + mhs_1.NIM);
        System.out.println("Prodi : " + mhs_1.Prodi);
        System.out.println("Umur : " + mhs_1.umur);
        System.out.println("IPK : " + mhs_1.IPK);
    }
}