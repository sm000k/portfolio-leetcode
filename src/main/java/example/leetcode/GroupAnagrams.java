package example.leetcode;

import javax.xml.stream.events.Characters;
import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<Set<Character>, List<String>> mapOfSets = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        int sumControl = 0;
        for (String word : strs) {
            Set<Character> charactersInWordSet = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                charactersInWordSet.add(word.charAt(i));
                sumControl += word.charAt(i);
            }

            if (!mapOfSets.containsKey(charactersInWordSet)) {
                mapOfSets.put(charactersInWordSet, List.of(word));
            } else {

                var temp = new ArrayList<>((mapOfSets.get(charactersInWordSet)));
                temp.add(word);
                mapOfSets.put(charactersInWordSet, temp);
            }
        }
        for (Map.Entry<Set<Character>, List<String>> entry : mapOfSets.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

    public static void unitTest(String[] input, List<List<String>> expected) {
        System.out.print("input = " + Arrays.toString(input));
        System.out.print(" ");
        System.out.println("expected = " + expected);
        var result = groupAnagrams(input);
        System.out.println("result = " + result);
//        System.out.println(expected.equals(groupAnagrams(input)));

    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        unitTest(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}, Arrays.asList(
                        List.of("bat"),
                        Arrays.asList("nat", "tan"),
                        Arrays.asList("ate", "eat", "tea")
                )
        );
        unitTest(new String[]{"ddddddddddg", "dgggggggggg"}, Arrays.asList(
                        List.of("dgggggggggg"),
                        List.of("ddddddddddg")
                )
        );
    }
}
