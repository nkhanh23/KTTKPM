package behavioral.observer.tigia;

public class main {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTu a = new NhaDauTuA("Khánh ",t);
        NhaDauTu b = new NhaDauTuA("Anh ",t);

        System.out.println("Lần 1");
        t.notify(5);
        b.huyDangKy();
        System.out.println("Lần 2");
        t.notify(-5);
        b.dangKy();
        t.notify(-5);
        System.out.println("Lần 3");

    }

}
