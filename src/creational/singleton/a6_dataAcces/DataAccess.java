package creational.singleton.a6_dataAcces;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;
    List<SanPham> sps = new ArrayList<>();

    private DataAccess(){}

    public static DataAccess getInstance(){
        if(instance == null){
            instance = new DataAccess();
        }
        return instance;
    }

    public void add(SanPham s){
        sps.add(s);
    }

    public void inDS(){
        System.out.println(sps.toString());
    }
}
