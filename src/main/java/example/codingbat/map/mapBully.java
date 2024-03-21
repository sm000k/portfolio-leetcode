package com.codingbat.map;

import java.util.HashMap;
import java.util.Map;

public class mapBully {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "");
        map.put("b", "bully");

        if (map.containsKey("a")) System.out.println("contains");


    }
}
