package ontap;

public class HaiSan extends MatHang {
    private String loaiHaiSan;
    public HaiSan(String maMH, String tenMH, double giaMH,String loaiHaiSan)
    {
        super(maMH, tenMH, giaMH);
        this.loaiHaiSan=loaiHaiSan;
    }
    public double tinhKhuyenMai(int soLuong)
    {
        if(soLuong<=5){
            return 1;
        }
        else{
            return 0.05*tinhGiaBan(soLuong);
        }
    }
}
