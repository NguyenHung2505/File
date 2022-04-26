package Main;

import java.io.File;
import java.io.IOException;

public class FiLeabc {
    public FiLeabc(String s) {
    }

    public static void main(String[] args) {
//        kiểm tra file có tông tại hay không

//        có tồn tại trả về true
        File file1 = new File("D:\\Oppmodum2\\XuLyNgoaiLevaDebug\\src\\Main\\FiLe");
        System.out.println("kiểm tra file có tồn tại hay không :" + file1.exists());

//        không tồn tại trả về false
        File file2 = new File("D:\\Oppmodum2\\XuLyNgoaiLevaDebug\\src\\Main\\FiLe25");
        System.out.println("kiểm tra file có tồn tại hay không :" + file2.exists());

//        tao file(tạo thư mục) mới bằng phương thức mkdir (mkdir = add)
//        tạo 1 thư mục
        File d1 = new File("D:\\Oppmodum2\\XuLyNgoaiLevaDebug\\src\\Main\\TaoFileTuPT1");
        d1.mkdir();

//        tạo nhiều file 1 lúc bằng mkdir
//
        File d2 = new File("D:\\Oppmodum2\\XuLyNgoaiLevaDebug\\src\\Main\\TaoFileTuPT1\\TaoFileTuPT2");
        d2.mkdirs();

//        tạo tập tin (có phần mở rộng: .exe , .txt , .doc , .xls .... )
        File file = new File("D:\\Oppmodum2\\XuLyNgoaiLevaDebug\\src\\Main\\TaoFileTuPT1\\ViDu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
//            không có quyên tạo tập tin
//            ô cứng bị  đầy
//            đường dẫn sai
            e.printStackTrace();
        }
    }
}
