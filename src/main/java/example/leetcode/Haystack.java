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
        inputDataList.add(new InputData("mississippi", "issipi"));
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
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int haystackIndex = 0; haystackIndex < haystack.length(); haystackIndex++) {
            if (haystack.length() - haystackIndex >= needle.length()) {
                for (int needleIndex = 0; needleIndex < needle.length(); needleIndex++) {
                    if (haystack.charAt(haystackIndex + needleIndex) != needle.charAt(needleIndex)) {
                        break;
                    }
                    if (needleIndex == needle.length() - 1) {
                        return haystackIndex;
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
