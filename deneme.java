package Giris;

import java.util.Scanner; //scanf gibi
public class deneme {
    public static void main(String[] args) {
        
        int mat, fizik, kimya, biyoloji, turkce;
        Scanner input = new Scanner(System.in);

        System.out.print("mat: ");
        mat=input.nextInt();

        System.out.print("fizik: ");
        fizik=input.nextInt();

        System.out.print("kimya: ");
        kimya=input.nextInt();

        System.out.print("biyoloji: ");
        biyoloji=input.nextInt();

        System.out.print("turkce: ");
        turkce=input.nextInt();

        int toplam=(mat+fizik+kimya+biyoloji+turkce);
        double sonuc=toplam/6;

        System.out.println("ortalama: " + sonuc);
    }
}

