package Main;

import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0 ;
        try{
            System.out.println("nhap so nguyen n : ");
            n = scanner.nextInt();
        }catch (Exception e){
            System.out.println("nhap gia tri khong dung");

        }finally {
            System.out.println("Finally!");
        }

        System.out.println("gia tri nhap la :" + n);
        System.out.println("ket thuc chuong trinh ! ");
    }
}
