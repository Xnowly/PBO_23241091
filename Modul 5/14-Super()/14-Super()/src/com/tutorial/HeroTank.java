package com.tutorial;

public class HeroTank extends Hero {
    // atribut
    String nama = "class hero tank";

    // overriding terhadap method
    void cetak(){
        System.out.println(" ini adalah : " + super.nama);
    }
    
}
