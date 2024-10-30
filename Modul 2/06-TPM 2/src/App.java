class BangunDatar {
    // Membuat atribut
    double panjang;
    double lebar;

    // Membuat constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Membuat method
    public void hitungLuas() {
        double luas = panjang * lebar;
        System.out.println("Luas: " + luas);
    }

    public void hitungKeliling() {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling: " + keliling);
    }

    public double cetakHasil() {
        // Menghitung luas dan keliling
        hitungLuas();
        hitungKeliling();
        
        // Mengembalikan luas sebagai hasil
        return panjang * lebar; // return the area
    }
}

public class App {
    public static void main(String[] args) {
        

        BangunDatar persegi = new BangunDatar(2, 5);
        double hasil = persegi.cetakHasil();;
        //System.out.println("Hasil (Luas): " + hasil);
    }
}
