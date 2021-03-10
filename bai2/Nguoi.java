import javax.swing.text.html.HTML;

import jdk.tools.jlink.resources.plugins;

public class Nguoi{
    private int maSo;
    private String hoTen;
    private int ngaySinh;
    private String diaChi;
    public Nguoi(){

    }
    public Nguoi(int maSo, String hoTen, int ngaySinh, String diaChi){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    public int getMaSo(){
        return maSo;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setNgaySinh(int ngaySinh){
        this.ngaySinh = ngaySinh;
    }
    public int getNgaySinh(){
        return ngaySinh;
    }public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public String getDiaChi(){
        return diaChi;
    }
    public String toString(){
        return "Ma so: " + maSo + ", ho ten: " + hoTen + ", ngay sinh: " + ngaySinh + ", dia chi: " + diaChi;
    }
}