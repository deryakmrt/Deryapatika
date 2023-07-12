package Giris;

import java.util.Scanner; 

public class deneme2 {
    public static void main(String[] args) {

    double tutar, kdvOran=0.18;
    Scanner input = new Scanner(System.in);
    System.out.println("Ucreti giriniz: ");
    tutar = input.nextDouble();

    double kdvTutar= tutar*kdvOran;
    double kdvliTutar= tutar+kdvTutar;

    System.out.println("kdv siz "+tutar);
    System.out.println("kdv tutari "+kdvTutar);
    System.out.println("kdvli tutar "+kdvliTutar);
}
}