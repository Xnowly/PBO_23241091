class Kalkulator{
    //membuat konstruksi
    Kalkulator(){
  
    }
  
    //membuat method
    int add(int a, int b){
        
      return a + b;
    }
    
    int subtract(int a, int b){
      return a - b;
    }
  
    int multiply(int a, int b){
      return a * b;
    }
  
    int device(int a, int b){
      return a / b;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Kalkulator kalk = new Kalkulator();
        System.out.println("Penjumlahan : " + kalk.add(5, 7));
        System.out.println("Pengurangan : " + kalk.subtract(45, 11));
        System.out.println("Perkalian : " + kalk.multiply(1, 3));
        System.out.println("Pembagian : " + kalk.device(4, 2));
    }

}
