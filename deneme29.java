import java.util.Scanner;
public class deneme29 {
    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("ucgenin boyutunu giriniz : ");
        int n = inp.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <n- i; j++) {
                System.out.print(" ");
                }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
                }
            System.out.println();
        }
    }
}