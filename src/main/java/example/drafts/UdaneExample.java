package example.drafts;

public class UdaneExample {

    //    https://codingbat.com/prob/p163932
    public int sumDigits(int n) {

        if (n == 0) return 0;

        int reszta = n % 10;

        return reszta + sumDigits(n / 10);

    }

    public static int countHi(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int x = 0;

        if (str.length() >= 2) {
            if (str.substring(0, 2).equals("hi")) {
                x = 1;
            }
        }

        return x + countHi(str.substring(1));
    }

    public static void main(String[] args) {
//        int hi = countHi("hi");
//        System.out.println("hi = " + hi);
        System.out.println(countHi("xhixhxihihhhih"));
    }
}
