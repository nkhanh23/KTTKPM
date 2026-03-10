package creational.builder.a1_hoa_don;

public class CTHD {
    String sp;
    int sl,donGia;
    float chietKhau;

    public CTHD(String sp, int sl, int donGia, float chietKhau) {
        this.sp = sp;
        this.sl = sl;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "sp='" + sp + '\'' +
                ", sl=" + sl +
                ", donGia=" + donGia +
                ", chietKhau=" + chietKhau +
                '}';
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }
}
