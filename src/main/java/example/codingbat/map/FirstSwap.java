package example.codingbat.map;

import java.util.HashMap;

//https://codingbat.com/prob/p150113
public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i].substring(0, 1))) {
                map.put(strings[i].substring(0, 1), i);
            } else {
                if (map.get(strings[i].substring(0, 1)) > -1) {
                    String temp = strings[map.get(strings[i].substring(0, 1))];
                    strings[map.get(strings[i].substring(0, 1))] = strings[i];
                    strings[i] = temp;
                } else {
                    continue;
                }
                map.replace(strings[i].substring(0, 1), -1);
            }
        }
        return strings;
    }
}
