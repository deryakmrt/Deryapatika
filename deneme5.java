package Giris;
import java.util.Scanner;
public class deneme5 {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        System.out.print("yaricap gir: ");
        Scanner inp = new Scanner(System.in);
        r=inp.nextInt();
        double alan=pi*r*r;
        double cevre=2*pi*r;

        System.out.println("alan: "+alan);
        System.out.print("cevre: "+cevre);
    }
}
