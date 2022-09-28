package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        /*
        Scanner scan=new Scanner(System.in);
        String adi,soyadi;
        System.out.println("adinizi giriniz :");
        adi=scan.nextLine();
        System.out.println("soyadinizi giriniz :");
        soyadi=scan.nextLine();
        System.out.println("adi :" + adi);
        System.out.println("soyadi :" + soyadi);


         */


        //ikinci yol.. hocanin yaptigi...
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String kullaniciIsmi = scan.nextLine();
        System.out.println("isminiz :" + kullaniciIsmi);


    }
}
