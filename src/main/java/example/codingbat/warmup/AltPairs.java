package com.codingbat.warmup;

public class AltPairs {
    public static String altPairs(String str) {
        String resultString = "";
        if (str.length() < 2) {
            return str;
        }
        for (int i = 0; i < str.length(); i = i + 4) {

            resultString += str.substring(i, i + 1);
            if (str.length() - i > 1) {
                resultString += str.substring(i + 1, i + 2);
            }

        }
        return resultString;
    }


    public static void main(String[] args) {
        String y = altPairs("chocolate");
        System.out.println(y);
    }
}
