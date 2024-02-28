package Lab3;
import java.util.Scanner;

public class btslide30 {
    public static void main(String[] args) {
        int n, SoDu, tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong bat ki: ");
        n = sc.nextInt();
            while (n > 0) {
                SoDu = n % 10;
                n = n / 10;
                tong += SoDu;
            }
            System.out.println("Tong cac chu so = " + tong);
    }
}
