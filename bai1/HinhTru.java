public class HinhTru extends HinhTron {
    private double chieuCao;
    public HinhTru(){

    }
    public HinhTru(double banKinh, double chieuCao){
        
        super(banKinh);
        this.chieuCao = chieuCao;
    }
    public void setChieuCao(double chieuCao){
        this.chieuCao = chieuCao;
    }
    public double getChieuCao(){
        return chieuCao;
    }
    public double getVolume(){
        return chieuCao*3.14*super.getBanKinh()*super.getBanKinh();
    }
    @Override
    public String toString(){
        return super.toString() + ", chieu Cao: " + chieuCao;
    }
    
}
