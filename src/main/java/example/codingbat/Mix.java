package com.codingbat;

public class Mix {
    public static String mixString(String a, String b) {
        int max_length = a.length()+b.length();
        String bigString="";
        int j=0;
        int k=0;
        for (int i = 0; i < max_length; i++){
            if(i%2==0 ){

                bigString += j<a.length()?a.substring(j,j+1):"";
                j+=1;
                continue;

            }
            if (i%2==1){
                bigString += k<b.length()?b.substring(k,k+1):"";
                k++;
                continue;
            }
        }
        return bigString;
    }

    public static void main(String[] args) {
        mixString("Hi","There");
    }
}
