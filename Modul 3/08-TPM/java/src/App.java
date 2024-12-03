class Hitung_Gaji_Bersih{
    private int gaji_pokok;
    private int tunjangan;
    private double pajak;

    //setter untuk gaji pokok
    public void setGajipokok(int gaji_pokok){
        this.gaji_pokok = gaji_pokok;
    }
    //getter untuk gaji pokok
    public int getGajiPokok(){
        return gaji_pokok; 
    }
    //setter untuk tunjangan
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    //getter untuk tunjangan
    public int getTunjangan(){
        return tunjangan;
    }
    //setter untuk pajak
    public void setPajak(double pajak){
        this.pajak = pajak;
    }
    //getter untuk pajak
    public double getPajak(){
        double totalGaji = gaji_pokok + tunjangan;
        return (pajak/100)*totalGaji;
    }
    //cetak gaji bersih
    public void cetakGajiBersih(){
        double totalGaji = (gaji_pokok + tunjangan) - getPajak();
        System.out.println("Gaji Bersih Anda adalag sebesar : Rp. " + totalGaji);
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //inisialisasi objek
        Hitung_Gaji_Bersih gaji = new Hitung_Gaji_Bersih();

        //menulis gaji pokok
        gaji.setGajipokok(5000000);
        //menulis tunjangan
        gaji.setTunjangan(1000000);
        //menulis pajak
        gaji.setPajak(10);

        //cetak gaji bersih
        gaji.cetakGajiBersih();
        

       
    }
}
