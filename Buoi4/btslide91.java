package Buoi4;
import java.util.Scanner;

public class btslide91 {

    public static void main(String[] args) {
        String chuoi;
    char kyTu;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao chuoi bat ky: ");
    chuoi = sc.nextLine();
    System.out.println("Cac ky tu trong chuoi la: ");
    for (int i = 0; i < chuoi.length(); i++) {
        kyTu = chuoi.charAt(i);
        System.out.println(kyTu);
    }
}

    }