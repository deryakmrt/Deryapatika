package Giris;
import java.util.Scanner;
public class deneme7 {
    public static void main(String[] args) {
        
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00;

        System.out.print("kac kg armut?:  ");
        Scanner a= new Scanner(System.in);
        armut = a.nextDouble();

        System.out.print("kac kg elma?:  ");
        elma = a.nextDouble();

        System.out.print("kac kg domates?:  ");
        domates = a.nextDouble();

        System.out.print("kac kg muz?:  ");
        muz = a.nextDouble();

        System.out.print("kac kg patlican?:  ");
        patlican = a.nextDouble();
      
        double toplam= armut+elma+muz+domates+patlican;
        System.out.print("Toplam Tutar: "+toplam);
    }
    
}
