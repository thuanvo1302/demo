package ontap;


public abstract class MatHang {
    protected String maMH;
    protected String tenMH;
    protected double giaMH;
    public MatHang(String maMH, String tenMH, double giaMH){
        this.maMH=maMH;
        this.tenMH=tenMH;
        this.giaMH=giaMH;
    }
    public double tinhGiaBan(int soLuong){
        return this.giaMH*soLuong;
    }
    public abstract double tinhKhuyenMai(int soLuong);
    public double tinhTongGiaBan(int soLuong){
        return tinhGiaBan(soLuong)-tinhKhuyenMai(soLuong);
    }

}
