package Lab2;
import java.util.Scanner;


public class ptbac1 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("a = ");
        a = sc.nextDouble();
        System.out.print("b = ");
        b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
                
            }else{
                System.out.println("Phuong trinh vo nghiem.");
            }
        }else{
            double x = -b/a;
            System.out.println("Phuong trinh co nghiem x = " + x);

        }

    }
}