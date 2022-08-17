package com.company;

import java.util.Scanner;

public class atm {
    public void calis(hesap hesap){
        login login=new login();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamıza Hoş Geldiniz...");
        System.out.println("****************");
        System.out.println("Kullanıcı girişi:");
        System.out.println("****************");
        int giris_hakki=3;
        while (true){
            if (login.login(hesap)){
                System.out.println("Giriş başarılı");
                break;
            }
            else {
                System.out.println("Giriş başarısız");
                giris_hakki-=1;
                System.out.println("Kalan giriş hakkınız:"+giris_hakki);
            }
            if (giris_hakki==0){
                System.out.println("Giriş hakkınız bitmiştir.");
                return;
            }
        }
        System.out.println("**************");
        String islemler= "1.Bakiye Görüntüleme\n"+
                "2.Para Yatırma\n"+
                "3.Para Çekme \n"+
                "Çıkış için q'ya basınız.";
        System.out.println(islemler);
        System.out.println("**************");
        while (true){
            System.out.println("İşlemi seçiniz...");
            String islem=scanner.nextLine();
            if (islem.equals("q")){
                break;
            }
            else if (islem.equals("1")){
                System.out.print("Bakiyeniz:"+hesap.getBakiye());
            }
            else if (islem.equals("2")){
                System.out.print("Yatırmak istediğiniz tutarı giriniz:");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);

            }
            else if (islem.equals("3")){
                System.out.print("Çekmek istediğiniz tutarı giriniz:");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraCekme(tutar);

            }
            else {
                System.out.println("Geçersiz işlem");
            }


        }
    }
}
