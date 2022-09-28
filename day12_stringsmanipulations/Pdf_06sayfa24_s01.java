package day12_stringsmanipulations;

public class Pdf_06sayfa24_s01 {
    public static void main(String[] args) {
       // Soru 1) String methodlarini kullanarak “
        // Java ogrenmek123 Cok guzel(Ad ” String'ini “Java
        //ogrenmek cok guzel.” sekline getirin.
        String str=" Java ogrenmek123 Cok guzel@ ";
        System.out.println(str.trim().replace("@",".")
                                     .replaceAll("\\d","")
                                     .replace("C","c"));




    }
}
