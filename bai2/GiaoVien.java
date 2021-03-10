import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class GiaoVien extends Nguoi {
    private String boMon;
    private String khoa;
    private String hocHam;
    private String hocVi;
    private int luong;

    public GiaoVien(){

    }
    
    public GiaoVien(int maSo, String hoTen, int ngaySinh, String diaChi, String boMon, String khoa, String hocHam, String hocVi, int luong){
        super(maSo, hoTen, ngaySinh, diaChi);
        this.boMon = boMon;
        this.khoa = khoa;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.luong = luong;
    }

    public void setBoMon(String boMon){
        this.boMon = boMon;
    }
    
    public String getBoMon(){
        return boMon;
    }

    public void setKhoa(String khoa){
        this.khoa = khoa;
    }

    public String getKhoa(){
        return khoa;
    }

    public void setHocHam(String hocHam){
        this.hocHam = hocHam;
    }

    public String getHocHam(){
        return hocHam;
    }

    public void setHocVi(String hocVi){
        this.hocVi = hocVi;
    }

    public String getHocVi(){
        return hocVi;
    }

    public void setLuong(int luong){
        this.luong = luong;
    }

    public int getLuong(){
        return luong;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", bo mon: " + boMon + ", khoa: " + khoa + ", hoc ham: " + hocHam + ", hoc vi: " + hocVi + ", luong: " + luong;
    }
}

