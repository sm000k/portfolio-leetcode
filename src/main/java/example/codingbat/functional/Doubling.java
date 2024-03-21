package example.codingbat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        doubleTest(Arrays.asList(new Integer[]{1, 2, 3}));
    }

    private static void doubleTest(List<Integer> list) {
        var result = doubling(list);
        System.out.println(result);
    }
}
