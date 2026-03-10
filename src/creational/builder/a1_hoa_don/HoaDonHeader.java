package creational.builder.a1_hoa_don;

public class HoaDonHeader {
    String hdId, ngayBan, kh;

    public HoaDonHeader(String hdId, String ngayBan, String kh) {
        this.hdId = hdId;
        this.ngayBan = ngayBan;
        this.kh = kh;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "hdId='" + hdId + '\'' +
                ", ngayBan='" + ngayBan + '\'' +
                ", kh='" + kh + '\'' +
                '}';
    }

    public String getHdId() {
        return hdId;
    }

    public void setHdId(String hdId) {
        this.hdId = hdId;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }
}
