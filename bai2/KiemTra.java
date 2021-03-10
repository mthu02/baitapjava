public class KiemTra {
    public static void main(String[] args){
        SinhVien sv = new SinhVien(01, "Ngo Minh Thu", 01, "Binh Dinh", "PTDL", "KHMT", 2019, 2025);
        GiaoVien gv = new GiaoVien(01, "Giao Vien", 1997, "Ha Noi", "NNLT", "CNTT", "hocHam", "hocVi", 10000000);
        System.out.println(sv.toString());
        System.out.println(gv.toString());
    }
}
