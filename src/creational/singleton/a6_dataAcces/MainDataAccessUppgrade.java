package creational.singleton.a6_dataAcces;

public class MainDataAccessUppgrade {
    public static void main(String[] args) {
        DataAccessUpgrade ui1 = DataAccessUpgrade.getInstance("khanh");
        DataAccessUpgrade ui2 = DataAccessUpgrade.getInstance("anh");
        DataAccessUpgrade ui3 = DataAccessUpgrade.getInstance("khanh");

        ui1.add(new SanPham("01","Mut Dua",50000));
        ui2.add(new SanPham("02","Mut Coc",100000));
        ui2.add(new SanPham("03","Mut Xoai",100000));

        ui1.inDS();;

    }
}
