package example.leetcode;

import java.util.List;

public class HelloWorld {

    public static int giveLastWorld(String s) {
        String[] arrayPhrase = s.split(" ");
        for (int i = arrayPhrase.length - 1; i > 0; i--) {
            if (arrayPhrase[i].length() > 0) {
                return arrayPhrase[i].length();
            }
        }
        return 0;
    }


    public static int lengthOfLastWord(String s) {
        String[] listOfWords = s.split(" ");
        return listOfWords[listOfWords.length - 1].length();
    }


    public static void main(String[] args) {
        String[] inputList = {
                "     fly me   to   the moon     ",
                "luffy is still joyboy",
                "Hello World"
        };
        for (String sentence : inputList) {
            System.out.println(sentence + ": " + lengthOfLastWord(sentence));
        }

    }
}

