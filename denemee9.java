package Giris;
import java.util.Scanner;
public class denemee9 {
    public static void main(String[] args) {
        String kullanici,sifre;

        Scanner inp=new Scanner(System.in);
        System.out.print("kullanici adi: ");
        kullanici=inp.nextLine();
        System.out.print("sifre: ");;
        sifre=inp.nextLine();

        if(kullanici.equals("patika") && sifre.equals("java123")){
            System.out.println("giris yaptiniz...");
        }
        else{ //yanlis sifre girdiginde
            System.out.println("yanlis giris yaptiniz!\nsifreyi yenilemek isterseniz 1 tuslayiniz");
            int secim;
            String yeniSifre;
            Scanner s=new Scanner(System.in);
            secim=s.nextInt();

            if (secim==1){ //sifre yenileme
                System.out.println("yeni sifreyi giriniz: ");
                yeniSifre=s.nextLine();

                if(yeniSifre.equals("java123") || (yeniSifre.equals(sifre)));{ //eski sifreyi girdiginde
                    System.out.println("sifre olusturulamadi baska sifre giriniz...");

                }
                /*else{
                    System.out.println("sifre olusturuldu...");
                }*/
            }

            else{ //sifre yenilememe
                System.out.println("yeni sifre olusturulmuyor...");
            }
        }
    }
}

