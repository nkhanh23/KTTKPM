package creational.builder.a1_hoa_don;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder()
                .buildHeader("HD01","29/1/26","Khanh")
                .addCTHD("Me",5,45000,0.1F)
                .addCTHD("Xoai",3,35000,0.5F)
                .addCTHD("mam",2,25000,0.15F)
                .build();
        hd.inHD();
    }
}
