package behavioral.observer.atm;

public class TaiKhoan implements ATMListener{
    private String tenTk;
    private int soDu;
    private ATM atm;

    public TaiKhoan(String tenTk, int soDu, ATM atm) {
        this.tenTk = tenTk;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaThe(){
        atm.nhanThe(this);
        System.out.println(tenTk + "da dua the vao atm");
    }

    public void rutThe(){
        atm.traThe();
        System.out.println(tenTk + "da dua the ra khoi atm");
    }

    public boolean kiemTraSoDu(int soTien) {
        if (soTien <= 50) {
            System.out.println("Tai khoan phai co so du tren 50");
            return false;
        }
        if (soDu >= soTien) {
            soDu -= soTien;
            return true;
        }
        return false;
    }

    public void nhanThongBao(int soTien, boolean thanhCong) {
        System.out.println("So du hien tai la: " + soDu);
        if (thanhCong) {
            System.out.println("Rut " + soTien + " thanh cong.");
            System.out.println("So du con lai: " + soDu);
        } else {
            System.out.println("Rut " + soTien + " that bai. So du khong du hoac so tien khong hop le.");
            System.out.println("So du hien tai: " + soDu);
        }
    }
}
