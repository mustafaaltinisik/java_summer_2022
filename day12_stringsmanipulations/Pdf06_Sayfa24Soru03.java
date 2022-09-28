package day12_stringsmanipulations;

import java.util.Scanner;

public class Pdf06_Sayfa24Soru03 {
    public static void main(String[] args) {
        /*  Kullanicidan isim isteyin. Eger
- isim "a" harfi içeriyorsa "Girdiğiniz isim a harfi içeriyor"
- isim "Z" harfi içeriyorsa "Girdiğiniz isim Z harfi içeriyor"
- ikisi de yoksa "Girdiğiniz isim "a" veya "Z" harfi içermiyor" yazdırın.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim=scan.nextLine();

        if (isim.contains("z") && isim.contains("a")){
            System.out.println("girdiginiz isim z ve a harfi iceriyor");
        }else if (isim.contains("a")) {
            System.out.println("girdiginiz isim 'a' harfi iceriyor");
        }else if(isim.contains("z"))
        System.out.println("girdiginiz isim 'z' harfi iceriyor");

        else System.out.println("girdiginiz isim 'a ' veya 'z' harfi icermiyor" );








    }
}
