package DanhSach;

public class SanPham {
    private String tenSP;
    private int gia;
    private String HSD;

    public SanPham() {}

    public SanPham(String tenSP, int gia, String HSD) {
        this.tenSP = tenSP;
        this.gia = gia;
        this.HSD = HSD;
    }

    public String getTenSP() {return tenSP;}
    public void setTenSP(String tenSP) {this.tenSP = tenSP;}

    public int getGia() {return gia;}
    public void setGia(int gia) {this.gia = gia;}

    public String getHSD() {return HSD;}
    public void setHSD(String HSD) {this.HSD = HSD;}

    @Override
    public String toString() {
        return "sanPham{" +
                "tenSP='" + tenSP + '\'' +
                ", gia=" + gia +
                ", HSD='" + HSD + '\'' +
                '}';
    }
}
