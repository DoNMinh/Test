package Buoi4;

import java.util.Scanner;

public class btslide95b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen duong: ");
        int soNguyen = sc.nextInt();

        while (soNguyen < 0) {
            System.out.println("Vui long nhap vao mot so nguyen duong: ");
            soNguyen = sc.nextInt();
        }
        long ketQua = 1;
        for(int i = 1; i <= soNguyen; i++){
            ketQua *= i;
        }
        System.out.println("Giai thua cua so vua nhap la: " + ketQua);
    }
}
