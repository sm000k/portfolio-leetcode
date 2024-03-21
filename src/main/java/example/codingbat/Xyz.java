package codingbat;

public class Xyz {
    public static boolean xyzThere(String str) {
        for ( int i = 0; i < str.length()-3; i++){
            if (str.substring(i,i+4).equals(".xyz")) return false;
        }
        for ( int i = 0; i < str.length()-2; i++){
            if (str.substring(i,i+3).equals("xyz")) return true;
        }

        return false;
    }

    public static void main(String[] args) {
//        xyzThere("abc.xyzxyz");
        System.out.println("paweł".substring(1));

    }
}
