package ArrayTongTich;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayTongTich {
    public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);
            System.out.println(" nhap a : ");
            int a = sc.nextInt();
            System.out.println(" nhap b : ");
            int b = sc.nextInt();

        FileWriter fw = new FileWriter("D:\\Oppmodum2\\XuLyNgoaiLevaDebug\\src\\ArrayTongTich\\date1.txt");
        fw.write(a+" "+ b);

        fw.close();
       Scanner aa = new Scanner(new File("D:\\Oppmodum2\\XuLyNgoaiLevaDebug\\src\\ArrayTongTich\\date1.txt")) ;

        List<Integer> list = new ArrayList<>();
       while (aa.hasNext()){
           int ab = aa.nextInt();
           list.add(ab);
       }
        System.out.println(list);
       int tong = list.get(0)+list.get(1);
        System.out.println("tong  = " + tong);


        int tich = list.get(0)*list.get(1);
        System.out.println("tich = " + tich);

        FileWriter cd = new FileWriter("D:\\Oppmodum2\\XuLyNgoaiLevaDebug\\src\\ArrayTongTich\\date.txt");
        cd.write(tong +" "+tich);
        cd.close();

        }

}
