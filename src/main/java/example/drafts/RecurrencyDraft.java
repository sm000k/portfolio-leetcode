package example.drafts;

public class RecurrencyDraft {
    static void preRecursion(int n) {
        if (n == 0) {
            System.out.println("Blastoff");
        } else {
            System.out.println(n);
            preRecursion(n - 1);
        }
    }

    static void afterRecursion(int n) {
        if (n == 0) {
            System.out.println("Blastoff");
        } else {
            preRecursion(n - 1);
            System.out.println(n);
        }
    }

    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }

    public static void main(String[] args) {
//        preRecursion(5);
        afterRecursion(5);

    }
}
