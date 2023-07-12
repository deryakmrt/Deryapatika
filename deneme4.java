package Giris;
import java.util.Scanner;
public class deneme4 {
    public static void main(String[] args) {
        int km;
        double perKm=2.20, total, baslangic=10;

        Scanner input = new Scanner(System.in);
        System.out.print("mesafeyi km cinsinden girin>>> ");
        km=input.nextInt();

        total=(km*perKm);
        total+=baslangic;
        total= (total<20) ? 20 : total;
        System.out.print("Son tutar: "+total);
    }
}