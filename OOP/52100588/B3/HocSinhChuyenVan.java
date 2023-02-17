public class HocSinhChuyenVan extends HocSinh{
    private String maLop;
    public HocSinhChuyenVan(){
        super();
        this.maLop = "";
    }
    public HocSinhChuyenVan(String hoTen, double diemToan , double diemVan , double diemAnh,String maLop){
        super(hoTen,diemToan,diemVan,diemAnh);
        this.maLop = maLop;
    }
    public double tinhDiemTB(){
        return ( this.diemAnh + this.diemToan + this.diemVan*2 )/4;
    }
    public String toString(){
        return "(" + this.hoTen + "," + this.maLop + "," + tinhDiemTB() + ")";
    }
}
