package com.bdqn.eam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlockTest  {
    public List<String> list;
    {
        System.out.println("构造块");
        list=new ArrayList<String>();

    }
    public static Map<String,String> map;
    static {
        System.out.println("静态块");
        map=new HashMap<String, String>();
    }
    public BlockTest(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        BlockTest b=new BlockTest();
    }
}
