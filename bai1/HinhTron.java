public class HinhTron{
    private double banKinh;
    public HinhTron(){
    
    }
    public HinhTron(double banKinh){
        this.banKinh = banKinh;
    }
    public void setBanKinh(double banKinh){
        this.banKinh = banKinh;
    }
    public double getBanKinh(){
        return banKinh;
    }
    public double getArea(){
        return banKinh*banKinh*3.14;
    }
    public String toString(){
        return "Ban Kinh: " + banKinh + ";
    }
}