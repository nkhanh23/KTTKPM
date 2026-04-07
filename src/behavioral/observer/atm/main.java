package behavioral.observer.atm;

public class main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk1 = new TaiKhoan("Khanh", 5000, atm);

        tk1.duaThe();
        atm.rutTien(2000);
        atm.rutTien(4000);
        tk1.rutThe();
    }
}
