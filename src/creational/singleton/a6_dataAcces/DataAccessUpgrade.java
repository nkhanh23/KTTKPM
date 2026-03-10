package creational.singleton.a6_dataAcces;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class DataAccessUpgrade {
    private static Map<String, DataAccessUpgrade>  instance = new Hashtable<>();
    List<SanPham> sps = new ArrayList<>();

    private DataAccessUpgrade(){}

    public static DataAccessUpgrade getInstance(String tag){
        if(instance.get(tag) == null)
            instance.put(tag,new DataAccessUpgrade());
        return instance.get(tag);
    }

    public void add(SanPham s){
        sps.add(s);
    }

    public void inDS(){
        System.out.println(sps.toString());
    }
}
