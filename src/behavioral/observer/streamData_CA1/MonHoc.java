package behavioral.observer.streamData_CA1;

public class MonHoc {
    String ten;
    int soTC;

    public MonHoc(String ten, int soTC) {
        this.ten = ten;
        this.soTC = soTC;
    }

    public int getSoTC() {
        return soTC;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }
}
