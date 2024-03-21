package com.codingbat.warmup;

public class StringYak {
    public static String stringYak(String str) {
        String result = "";
        String temp ="";
        for(int i = 0; i<str.length();i++){

            if ( str.length()-i>2 && str.substring(i,i+3).equals("yak") ){
                temp = "";
                i=i+2;
            }
            else{
                temp = str.substring(i,i+1);
            }
            result += temp;

        }
        return result;
    }

    public static void main(String[] args) {
        stringYak("yakpak");
        stringYak("pakyak");
        stringYak("yak123ya");
    }

}
