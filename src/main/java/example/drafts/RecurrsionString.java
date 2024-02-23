package example.drafts;

public class RecurrsionString {

    public static String reverseString(int index, String s) {

        if (index < 0) return "";

        return s.charAt(index) + reverseString(index - 1, s);
    }


    public static void main(String[] args) {

        System.out.println(reverseString(4, "krowa"));
    }
}
