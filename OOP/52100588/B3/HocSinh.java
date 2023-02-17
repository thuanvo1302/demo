import javax.swing.UIDefaults.ProxyLazyValue;

public class HocSinh{
    protected String hoTen;
    protected double diemToan;
    protected double diemVan;
    protected double diemAnh;
    public HocSinh(){
        this.hoTen = "";
        this.diemToan = 0.0;
        this.diemVan = 0.0;
        this.diemAnh = 0.0;
    }
    public HocSinh(String hoTen,double diemToan, double diemVan, double diemAnh){
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }
    public double tinhDiemTB(){
        return ( diemAnh + diemToan + diemVan )/3;
    }
    public String toString(){
        return "(" + hoTen + "," + tinhDiemTB() + ")" ;
    }
}