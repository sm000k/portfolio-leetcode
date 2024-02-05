package example.leetcode;

import java.util.ArrayList;
import java.util.List;


//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//
//
//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//Example 2:
//
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.
//
//
//Constraints:
//
//        1 <= haystack.length, needle.length <= 104
//haystack and needle consist of only lowercase English characters.
public class Haystack {
    public static void main(String[] args) {
        List<InputData> inputDataList = new ArrayList<>();
        inputDataList.add(new InputData("sadbutsad", "sad"));
        inputDataList.add(new InputData("leetcode", "leeto"));

        for (InputData inputData : inputDataList) {
            System.out.println("word:"
                    + inputData.needle
                    + " in phrase:"
                    + inputData.haystack
                    + " on position :"
                    + strStr(inputData.haystack, inputData.needle)
            );
        }
    }

    public static int strStr(String haystack, String needle) {
        int assertedWordLength = 0;
        for (int i = 0; i < haystack.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) == needle.charAt(j)) {
                        assertedWordLength++;
                    }else{
                        assertedWordLength=0;
                        break;
                    }
                    if (assertedWordLength == needle.length()) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }

    static class InputData {
        String haystack;
        String needle;

        public InputData(String haystack, String needle) {
            this.haystack = haystack;
            this.needle = needle;
        }
    }
}
