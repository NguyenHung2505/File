package ThucHanh11;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Youtobe {
    public static void main(String[] args) throws IOException {
//      tao file
        File file1 = new File("ThucHanh11\\1.txt");
        File file2 = new File("ThucHanh11\\2.txt");
        file1.createNewFile();
        file2.createNewFile();

//      lấy giá trị đã nhập trong file1  với số đầu ứng vs a số thư 2 ứng với b
        PrintWriter printWriter = new PrintWriter(file2);

        Scanner sc = new Scanner(file1);
        List<Integer> integers = new ArrayList<>();


//        duyệt phần tử trong mảng
        while (sc.hasNext()){
            integers.add(sc.nextInt());
        }

        int sum = 0;
        for (int i:integers
             ) sum +=i;
        printWriter.println("tong la " +sum);













    }
}
