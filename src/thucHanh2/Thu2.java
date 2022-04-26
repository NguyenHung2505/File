package thucHanh2;

import Main.Trycatch;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Thu2 {
    public static void main(String[] args) throws IOException {

//        đọc 2 số a , b từ 1 file đã tạo sẳn xong int ra phương trình bậc nhất

        File file = new File("dataa.txt");
        file.createNewFile();
        Scanner sc1 = new Scanner(new File("dataa.txt"));
//        String ta = sc1.nextLine();
        String[] arr = sc1.nextLine().split(";");
        double a = Integer.parseInt(arr[0]);
        double b = Integer.parseInt(arr[1]);
        PrintWriter ma = new PrintWriter("dataa.txt");

        if(a==0){
            if(b==0){
                ma.println("phương trình vô số nghiệm");
            }else {
//                a = 0 and b!=0
                ma.println("phương trình vô nghiệm");
            }
        }else{
//            a!=0

            ma.println("phuong trình có 1 nghiệm: " + (-b/a));
        }
        ma.close();

    }
}
