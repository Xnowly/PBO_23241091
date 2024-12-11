package com.tutorial;

public class Hero {
    // atribut 
    String nama;
    double defensePower;
    double attackPower;

    //construktor
    Hero (String nama, double defensePower, double attackPower){
        this.nama = nama;
        this.defensePower = defensePower;
        this.attackPower = attackPower;
    }

    
    // method
    void cetak(){
        System.out.println("nama : " + this.nama);
        System.out.println("defense : " + this.defensePower);
        System.out.println("attack : " + this.attackPower);
    }
}
