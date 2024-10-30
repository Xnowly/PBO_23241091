class Bangun_Datar {
    double panjang;
    double lebar;

    Bangun_Datar(double Panjang, double Lebar) {
        this.panjang = Panjang;
        this.lebar = Lebar;
    }

    double hitungLuas() {
        return panjang * lebar;
    }

    double hitungKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    // Metode void baru untuk mencetak luas dan keliling
    void hitungLuasDanKeliling() {
        System.out.println("Luas = " + hitungLuas());
        System.out.println("Keliling = " + hitungKeliling());
    }

    void cetakHasil() {
        System.out.println("Luas = " + hitungLuas());
        System.out.println("Keliling = " + hitungKeliling());
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Bangun_Datar bangun = new Bangun_Datar(5, 5);

        // Memanggil metode void baru untuk mencetak luas dan keliling
        bangun.hitungLuasDanKeliling();
    }
}
