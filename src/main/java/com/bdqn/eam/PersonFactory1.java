package com.bdqn.eam;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory1 {
    private  Map<String,Perea> map;
     {
        map=new HashMap<String, Perea>();
        map.put("p1",new Perea("张三"));
        map.put("p2",new Perea("李四"));
        map.put("p3",new Perea("王五"));
    }
    public  Perea getPerea(String key){
        return map.get(key);
    }

}
