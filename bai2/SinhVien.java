import jdk.tools.jlink.resources.plugins;

public class SinhVien extends Nguoi {
    private String nganh;
    private String khoa;
    private int namNhapHoc;
    private int namTotNghiep;
    
    public SinhVien(){

    }
    public SinhVien(int maSo, String hoTen, int ngaySinh, String diaChi, String nganh, String khoa, int namNhapHoc, int namTotNghiep){
        super(maSo, hoTen, ngaySinh, diaChi);
        this.nganh = nganh;
        this.khoa = khoa;
        this.namNhapHoc = namNhapHoc;
        this.namTotNghiep = namTotNghiep;
    }

    public void setNganh(String nganh){
        this.nganh = nganh;
    }

    public String getNganh(){
        return nganh;
    }
    
    public void setKhoa(String khoa){
        this.khoa = khoa;
    }

    public String getKhoa(){
        return khoa;
    }

    public void setNamNhapHoc(int namNhapHoc){
        this.namNhapHoc = namNhapHoc;
    }

    public int namNhapHoc(){
        return namNhapHoc;
    }

    public void setNamTotNghiep(int namTotNghiep){
        this.namTotNghiep = namTotNghiep;
    }
    
    public int getNamTotNghiep(){
        return namTotNghiep;
    }

    @Override
    public String toString(){
        return super.toString() + ", nganh: " + nganh + ", khoa: " + khoa + ", nam nhap hoc: " + namNhapHoc + ", nam tot nghiep: " + namTotNghiep;
    }
}
