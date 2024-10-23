class Kalkulator {
    // Deklarasi atribut
    int bilanganPertama;
    int bilanganKedua;

    // Konstruktor dengan parameter untuk inisialisasi
    Kalkulator(int inputBilanganPertama, int inputBilanganKedua) {
        bilanganPertama = inputBilanganPertama;
        bilanganKedua = inputBilanganKedua;
    }

    // Method untuk penjumlahan
    int add() {
        return bilanganPertama + bilanganKedua;
    }

    // Method untuk pengurangan
    int subtract() {
        return bilanganPertama - bilanganKedua;
    }

    // Method untuk perkalian
    int multiply() {
        return bilanganPertama * bilanganKedua;
    }

    // Method untuk pembagian
    int divide() {
        if (bilanganKedua != 0) {
            return bilanganPertama / bilanganKedua;
        } else {
            System.out.println("Error: Tidak bisa membagi dengan nol.");
            return 0; // Nilai default jika pembagian dengan nol
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Membuat objek Kalkulator dengan nilai 20 dan 5
        Kalkulator kalkulator = new Kalkulator(20, 5);

        // Mencetak hasil dari berbagai operasi aritmatika
        System.out.println("Bilangan Pertama : " + kalkulator.bilanganPertama);
        System.out.println("Bilangan Kedua : " + kalkulator.bilanganKedua);
        System.out.println("Penjumlahan : " + kalkulator.add());
        System.out.println("Pengurangan : " + kalkulator.subtract());
        System.out.println("Perkalian : " + kalkulator.multiply());
        System.out.println("Pembagian : " + kalkulator.divide());
    }
}
