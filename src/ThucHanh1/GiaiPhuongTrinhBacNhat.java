package ThucHanh1;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a : ");
        float a = sc.nextFloat();

        System.out.println("nhập b : ");
        float b = sc.nextFloat();

        if(a==0){
            if(b==0){
                System.out.println("phương trình vô số nghiệm");
            }else {
//                a = 0 and b!=0
                System.out.println("phương trình vô nghiệm");
            }
            }else{
//            a!=0
            float nghiem = -b/a;
            System.out.println("phuong trình có 1 nghiệm: " + nghiem);
        }


    }
}
