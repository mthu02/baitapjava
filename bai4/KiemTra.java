public class KiemTra {
    public static void main(String[] args) {
        Diem diem1 = new Diem(3, 4);
        DiemDiChuyen ddc1 = new DiemDiChuyen(2, 3);
        System.out.println(diem1.toString());
        System.out.println(ddc1.toString());
        System.out.println("Quang duong diem di chuyen duoc la: " + ddc1.diChuyen(3));
        System.out.println("Toa do diem sau khi di chuyen: " + ddc1.diChuyenx(3) + ", " + ddc1.diChuyeny(3));
    }
}
