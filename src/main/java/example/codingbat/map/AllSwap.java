package com.codingbat.map;

import java.util.Arrays;
import java.util.HashMap;

public class AllSwap {
    public static String[] allSwap(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i].substring(0, 1))) {
                map.put(strings[i].substring(0, 1), i);
            }else{
                var leftIndex = map.get(strings[i].substring(0, 1));
                var temp = strings[map.get(strings[i].substring(0, 1))];
                strings[map.get(strings[i].substring(0, 1))] = strings[i];
                strings[i] = temp;
                map.remove((strings[i].substring(0, 1)));
            }

        }

        return strings;
    }

    private static void swap(String[] strings) {
        var temp = strings[1];
        strings[1] = strings[0];
        strings[0] = temp;
    }

    public static void main(String[] args) {
        var temp = allSwap(new String[]{"ab", "ac"});
        System.out.println(Arrays.toString(temp));
    }
}
