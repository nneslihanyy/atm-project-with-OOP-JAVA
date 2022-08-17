package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        atm atm=new atm();
        hesap hesap=new hesap("Neslihan","12345",10000);

        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor");
    }
}
