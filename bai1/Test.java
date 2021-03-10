import jdk.tools.jlink.resources.plugins;

public class Test{
    public static void main(String[] args){
        HinhTron htron1 = new HinhTron(2);
        HinhTru htru1 = new HinhTru(3, 2);
        System.out.println("Dien tich Hinh Tron: " + htron1.getArea()+ ", The tich Hinh Tru: "+htru1.getVolume());
    }
}