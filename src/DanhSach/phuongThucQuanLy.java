package DanhSach;

public interface phuongThucQuanLy<H> {
    void hienThi ();
    void sua (String tenSP ,H h);
    void xoa (String tenSP , H h);
    void thoat ();
    void them(SanPham sanPham);

    int viTri (String tenSP);
}
