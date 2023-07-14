package Giris;
import java.util.Scanner;
public class deneme8 {
    public static void main(String[] args) {
        int n1,n2,secim;
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz: ");
        n1= input.nextInt();
        System.out.println("ikinci sayiyi giriniz: ");
        n2=input.nextInt();

        System.out.println("Islemi seciniz:\n1)Toplama  2)Cikarma  3)Carpma  4)Bolme");
        secim=input.nextInt();

        switch(secim){
            case 1:
            System.out.println("Toplam:"+(n1+n2));
            break;

            case 2:
            System.out.println("Toplam:"+(n1-n2));
            break;

            case 3:
            System.out.println("Toplam:"+(n1*n2));
            break;

            case 4:
             if(n2!=0){
                 System.out.println("Toplam:"+(n1/n2));
            }
            else{
                System.out.println("bir sayi 0é bolunemez!");
            }
        default:
         System.out.println("yanlis tuslama yaptiniz..."); 
         }
    }
}

