package behavioral.observer.tigia;

public abstract class NhaDauTu implements TiGia.TiGiaListener{
    TiGia t;
    String ten;

    public NhaDauTu(String ten,TiGia t){
        this.ten = ten;
        this.t = t;
        t.attach(this);
    }
    public void dangKy(){
        t.attach(this);
    }

    public void huyDangKy(){
        t.detach(this);
    }
}
