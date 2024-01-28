package example.leetcode;

public class Palindrome {

//    1. plan działania trochę wolno się tworzył
//    2. rygor działania / pójście
//    3. wykorzystawanie definicji metody którą masz z zadania
//    4. static - trochę dystansu
//    5. formatowanie nie chaotycznie - widać że trzymasz jakąś konwencje
    //6. jak możesz szybko zdobyć punkty (nawet częśćiowym rozwiązaniem to to zrób)

    public static void main(String[] args) {
        String [] listOfStrings = {
                "AKA",
                "AKO",
                "Aka",
                "A man, a plan, a canal: Panama",
                "wannaw"
        };

        for (String str : listOfStrings) {
            System.out.println(str + ": " + isPalindrome(str));
        }
    }

    public static String cleanInputString(String inputPhrase) {
        String lowerCaseInputPhrase = inputPhrase.toLowerCase();

        String cleanedString = "";

        for (int i = 0; i < lowerCaseInputPhrase.length(); i++) {
            char x = lowerCaseInputPhrase.charAt(i);
            if ((x >= 'a' && x <= 'z') || (x >= '0' && x <= '9')) {
                cleanedString += x;
            }
        }
        return cleanedString;
    }

    public static boolean isPalindrome(String inputPhrase) {

        String clearedInputPhrase = cleanInputString(inputPhrase);

        for (int i = 0; i < clearedInputPhrase.length(); i++) {
            if (clearedInputPhrase.charAt(i) != clearedInputPhrase.charAt(clearedInputPhrase.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
