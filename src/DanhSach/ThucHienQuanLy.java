package DanhSach;

import java.util.ArrayList;
import java.util.List;

public class ThucHienQuanLy implements phuongThucQuanLy<SanPham> {
    List<SanPham> sanPhamList =new ArrayList<>();

    public ThucHienQuanLy() {
    }

    public ThucHienQuanLy(List<SanPham> sanPhamList) {
        this.sanPhamList = sanPhamList;
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < sanPhamList.size() ; i++) {
            System.out.println(this.sanPhamList.get(i));
        }

    }

    @Override
    public void them(SanPham sanPham) {
            sanPhamList.add(sanPham);
    }




    @Override
    public int viTri(String tenSP) {
        for (int i = 0; i < sanPhamList.size(); i++) {
            if(this.sanPhamList.get(i).getTenSP().equals(tenSP)){
                return i;
            }
        }
        return -1;

    }


    @Override
    public void sua(String tenSP , SanPham sanPham) {
        int indexOf=viTri(tenSP);
        if(indexOf == -1){
            System.out.println("khong co");
        } else{
            sanPhamList.set(viTri(tenSP) , sanPham);
        }
    }

    @Override
    public void xoa(String tenSP , SanPham sanPham) {
        int indexOf=viTri(tenSP);
        if(indexOf == -1){
            System.out.println("khooong cooo !");
        } else{
            sanPhamList.remove(indexOf);
        }



    }

    @Override
    public void thoat() {
        System.exit(0);

    }


}
