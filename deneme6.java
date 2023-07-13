package Giris;
import java.util.Scanner;
public class deneme6 {
    public static void main(String[] args) {
        
        double boy, kilo;
        System.out.print("Boyunuzu metre cinsinden giriniz:  ");
        Scanner secim= new Scanner(System.in);
        boy = secim.nextDouble();
        System.out.print("Kilonuzu giriniz:  ");
        kilo = secim.nextDouble();

        double indeks=(kilo/(boy*boy));
        System.out.print("Vucut kitle indeksi:  "+indeks);
    }
}
