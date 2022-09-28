package day12_stringsmanipulations;

import java.util.Scanner;

public class pdf06_sayfa24_soru04 {
    public static void main(String[] args) {
        // Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adinizigiriniz");
        String isim = scan.nextLine();
        System.out.println("lutfen soyadinizi giriniz");
        String soyisim = scan.nextLine();

        if(isim.length() > soyisim.length())
        {
            System.out.println("girilen isim daha uzun");
        }else
        System.out.println("girilen soisim daha uzun");
    }
}







