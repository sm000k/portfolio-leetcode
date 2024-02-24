package example.drafts;

public class changePI {

    static String changePI2(String str) {

        if (str.length() < 2) {
            return str;
        }
        String PI = "";
        String letter = "";
        if (str.substring(0, 2).equals("PI")) {
            PI = "3.14";
            return letter + PI + changePI2(str.substring(2));
        } else {
            letter = str.substring(0, 1);
        }

        return letter + PI + changePI2(str.substring(1));
    }

    public static String noX(String str) {

        if (str.length() < 1) return "";
        String letter;
        if (str.substring(0, 1).equals("x")) {
            letter = "";
        } else {
            letter = str.substring(0, 1);
        }

        String s = letter + noX(str.substring(1));
        System.out.println("s = " + s);
        return s;
    }

    public static String pairStar(String str) {
        System.out.println(str.substring(0, 1));
        if (str.length() < 2) return str;

        if (str.substring(0, 1).equals(str.substring(1, 2))) {
            return str.substring(0, 1) + "*" + pairStar(str.substring(1));
        } else {
            return str.substring(0, 1) + pairStar(str.substring(1));
        }
    }

    public static void main(String[] args) {
//        System.out.println(changePI2("xxPIxx"));

//        noX("abcdefghijklmn");

        String aaaa = pairStar("aaaa");
        System.out.println("aaaa = " + aaaa);
    }

}
