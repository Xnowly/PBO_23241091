package com.tutorial;

public class HeroTank extends Hero {
    // atribut
    String atribut = "tank";

    // subclass construktor
    HeroTank (String nama, double defensePower, double attackPower){
        super(nama,defensePower,attackPower);
    }

    // overriding method
    void cetak(){
        System.out.println(" hero : " + this.atribut);
        super.cetak();
    }
    
}
