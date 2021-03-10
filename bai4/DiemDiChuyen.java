public class DiemDiChuyen extends Diem {
    private double vx;
    private double vy;

    public DiemDiChuyen(){

    }
    public DiemDiChuyen(double vx, double vy){
        this.vx = vx;
        this.vy = vy;
    }
    public void setVx(double vx){
        this.vx = vx;
    }
    public void setVy(double vy){
        this.vy = vy;
    }
    public double getVx(){
        return vx;
    }
    public double getVy(){
        return vy;
    }
    public double diChuyen(double time){
        return Math.sqrt((vx*time)*(vx*time)+((vy*time)*(vy*time)));
    }
    public double diChuyenx(double time){
        return getX() + vx*time;
    }
    public double diChuyeny(double time){
        return getY() + vy*time;
    }
    
    @Override
    public String toString(){
        return "Van toc theo phuong ngang: " + vx +", Van toc theo phuong thang: " + vy ;
    }
}
