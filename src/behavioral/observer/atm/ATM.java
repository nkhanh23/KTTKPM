package behavioral.observer.atm;

public class ATM {
    private ATMListener taiKhoan;
    public void nhanThe(ATMListener tk){
        this.taiKhoan = tk;
        System.out.println("Da nhan the");
    }
    public void traThe(){
        this.taiKhoan = null;
        System.out.println("Da tra the");
    }
    public void rutTien(int soTien){
        if(taiKhoan == null) {
            System.out.println("Tai khoan khong co tien");
            return;
        }
        if(taiKhoan.kiemTraSoDu((soTien)))
            taiKhoan.nhanThongBao(soTien,true);
        else
            taiKhoan.nhanThongBao(soTien,false);
    }
}
