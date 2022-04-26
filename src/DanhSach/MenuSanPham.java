package DanhSach;

import java.util.Scanner;

public class MenuSanPham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThucHienQuanLy thucHienQuanLy = new ThucHienQuanLy();
        int luaChon = 0;

        do{
            System.out.println("MENU------");
            System.out.println("xin moi chon chuc nang :");
            System.out.println(
                    " + 1.   Thêm sản phẩm. \n"
                            +"2.  in các sẩn phẩm.\n"
                            +"3.  Sửa sản phẩm.\n"
                            +"4. xoá sp .\n"
                            +"5. thoát chương trình."
            );
                    luaChon = sc.nextInt();
                    sc.nextLine();

            if(luaChon==1){
                System.out.println("nhập tên sản phẩm "); String tenSP = sc.nextLine();
                System.out.println("nhập giá sản phẩm"); int gia = sc.nextInt();
                sc.nextLine();
                System.out.println("nhap HSD"); String HSD = sc.nextLine();
                SanPham sanPham = new SanPham(tenSP,gia,HSD);
                thucHienQuanLy.them(sanPham);

            }else if(luaChon==2){
                thucHienQuanLy.hienThi();

            }else if(luaChon==3){
                System.out.println(" nhập ten sp cần sữa : "); String tenSP1 =sc.nextLine();
                System.out.println("nhập tên sản phẩm "); String tenSP = sc.nextLine();
                System.out.println("nhập giá sản phẩm"); int gia = sc.nextInt();
                sc.nextLine();
                System.out.println("nhap HSD"); String HSD = sc.nextLine();
                SanPham sp = new SanPham(tenSP,gia,HSD);
                thucHienQuanLy.sua(tenSP1, sp);

            }else if(luaChon==4){

            }else if(luaChon==5){

            }else if(luaChon==6){

            }

        }while (luaChon!=0);


    }
}
