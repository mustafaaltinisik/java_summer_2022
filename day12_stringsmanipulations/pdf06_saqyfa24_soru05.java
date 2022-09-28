package day12_stringsmanipulations;

import java.util.Scanner;

public class pdf06_saqyfa24_soru05 {
    public static void main(String[] args) {
       // Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
        Scanner scan=new Scanner(System.in);

        System.out.println("4 harfli bir kelime girin");
        String kelime=scan.nextLine();


        String ters=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime .substring(0,1);
        System.out.println("Girilen kelimenin tersten okunuşu : " + ters);






    }
}
