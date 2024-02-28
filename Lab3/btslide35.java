package Lab3;
import java.util.Scanner;

public class btslide35 {

    

public static void main(String[]args){
    int firstNumber, secondNumber;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao so thu nhat: ");
    firstNumber = sc.nextInt();
    System.out.println("Nhap vao so thu hai: ");
    secondNumber = sc.nextInt();
      

    if (firstNumber > secondNumber){
        
        System.out.println("So nho nhat trong 2 so " + firstNumber + " va "+ secondNumber + " la " + secondNumber);

    }else{
        System.out.println("So nho nhat trong 2 so la: " + firstNumber);
    }
      
}

}