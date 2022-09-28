package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        // Statik olarak girilen 2 değişkenin değerlerinin yerini değiştiren programı
        // Java programlama dilinin söz diziminde yazınız .


        int sayi1 = 20;
        int sayi2 = 10;
        int temp = 0;


        temp = sayi1;
        sayi1 = sayi2;
        sayi2 = temp;
        System.out.println("swaptan sonra sayi1: " + sayi1 + "\nswaptan sonra sayi2: " + sayi2);

    }
}
