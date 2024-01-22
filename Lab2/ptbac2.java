package Lab2;
import java.util.Scanner;



    public class ptbac2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double a, b, c;
            System.out.print("a = ");
            a = sc.nextDouble();
            System.out.print("b = ");
            b = sc.nextDouble();
            System.out.print("c = ");
            c = sc.nextDouble();

            double delta = b * b - 4*a*c;

            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
                
            }if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b/2*a));
                
            } if (delta > 0)
                
            {
                double x1 = (-b + Math.sqrt(delta))/2*a;
                double x2 = (-b - Math.sqrt(delta))/2*a;
                System.out.println("Phuong trinh co 2 nghiem: x1 = " + x1 + " va x2 = " + x2);
                
            }
            
        }
    
}
