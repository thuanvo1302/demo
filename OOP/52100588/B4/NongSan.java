package ontap;

public class NongSan extends MatHang {
    private String loaiNongSan;
    public NongSan(String maMH,String tenMH, double giaMH, String loaiNongSan){
        super(maMH, tenMH, giaMH);
        this.loaiNongSan=loaiNongSan;
    }
    public double tinhThue()
    {
        if(this.loaiNongSan.equals("Bap Cai") || this.loaiNongSan.equals("Ca Chua") )
        {
            return 0.1;
        }else
        {
            return 0.05;
        }
    }
    public double tinhGiaBan(int soLuong){
        return super.tinhGiaBan(soLuong) + tinhThue() * super.tinhGiaBan(soLuong);
    }
    public double tinhKhuyenMai(int soLuong){
        return 0.1*this.tinhGiaBan(soLuong);
    }
}
