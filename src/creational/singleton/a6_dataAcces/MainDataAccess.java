package creational.singleton.a6_dataAcces;

public class MainDataAccess {
    public static void main(String[] args) {
        DataAccess u1 = DataAccess.getInstance();
        DataAccess u2 = DataAccess.getInstance();

        u1.add(new SanPham("01","Mut Dua",50000));
        u2.add(new SanPham("02","Mut Coc",100000));

        u1.inDS();;
    }
}
