package com.codingbat.warmup;


/*

https://codingbat.com/prob/p171260

Warmup-2 > stringX
prev  |  next  |  chance
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/



public class StringX {
    public String stringX(String str) {
        String result = "";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {

            temp = i != 0 && i != str.length() - 1 && str.substring(i, i + 1).equals("x") ? "" : str.substring(i, i + 1);

            result += temp;

        }
        return result;
    }


}