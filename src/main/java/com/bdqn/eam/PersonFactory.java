package com.bdqn.eam;

import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {
    private static Map<String,Perea> map;
    static {
        map=new HashMap<String, Perea>();
        map.put("p1",new Perea("张三"));
        map.put("p2",new Perea("李四"));
        map.put("p3",new Perea("王五"));
    }
    public static Perea getPerea(String key){
        return map.get(key);
    }

}
