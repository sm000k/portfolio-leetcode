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

    void afterRecursion(int n) {
        if (n == 0) {
            System.out.println("Blastoff");
        } else {
            preRecursion(n - 1);
            System.out.println(n);
        }
    }

    public int countA(String str) {
        // Base case -- return simple answer
        if (str.length() == 0) {
            return 0;
        }

        // Deal with the very front of the string (index 0) -- count "A" there.
        int count = 0;
        if (str.substring(0, 1).equals("A")) {
            count = 1;
        }

        // Make a recursive call to deal with the rest of string (the part beyond the front).
        // Add count to whatever the recursive call returns to make the final answer.
        // Note that str.substring(1) starts with char 1 and goes to the
        // end of the string.
        return count + countA(str.substring(1));
    }
    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }

    public static void main(String[] args) {
//        preRecursion(5);
        RecurrencyDraft recurrencyDraft = new RecurrencyDraft();
//        recurrencyDraft.afterRecursion(5);
        System.out.println(recurrencyDraft.countA("AnABol"));
    }
}
