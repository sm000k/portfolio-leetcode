package example.drafts;

public class UdaneExample {

//    https://codingbat.com/prob/p163932
    public int sumDigits(int n) {

        if (n==0) return 0;

        int reszta = n % 10;

        return reszta+sumDigits( n / 10);

    }

}
