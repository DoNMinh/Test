package Lab2;
import java.util.Scanner;


public class btslide92{
    

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("a = ");
        a = sc.nextDouble();
        System.out.print("b = ");
        b = sc.nextDouble();

        System.out.println("Tong = " + (a+b));
        System.out.println("Hieu = " + (a-b));
        System.out.println("Tich = " + (a*b));
        System.out.println("Thuong = " + (a/b));
        System.out.println("Chia lay du: " + (a%b));

        double Max = a>b?a:b;
        double Min = a<b?a:b;
        System.out.println("Max = " + Max);
        System.out.println("Min = " + Min);

        if (a%2==0) {
            System.out.println(a + " la so chan");
            System.out.println(b + " la so le");
        } else {
            System.out.println(a + " la so le");
            System.out.println(b + " la so chan");

        }
            
        }

    }



    
