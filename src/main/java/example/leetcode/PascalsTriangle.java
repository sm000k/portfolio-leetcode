package example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/description/

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangleRows = new ArrayList<>();
        if (numRows == 1) {
            return new ArrayList<>(List.of(List.of(1)));
        }

        triangleRows.add(List.of(1));
        triangleRows.add(Arrays.asList(1, 1));
        for (int currentRowIndex = 2; currentRowIndex < numRows; currentRowIndex++) {
            List<Integer> newRow = new ArrayList<>(currentRowIndex);
            newRow.add(1);
            int previousRowIndex = currentRowIndex - 1;
            for (int fulfillmentIndex = 0; fulfillmentIndex < previousRowIndex; fulfillmentIndex++) {
                List previousRow = triangleRows.get(currentRowIndex - 1);
                int newElement =(Integer) previousRow.get(fulfillmentIndex)
                        + (Integer) previousRow.get(fulfillmentIndex + 1);
                newRow.add(newElement);
            }
            newRow.add(1);
            triangleRows.add(newRow);
        }
        return triangleRows;
    }

    static void testUnitPascalsTriangle(int input, List<List<Integer>> expected) {
        List<List<Integer>> result = generate(input);
        System.out.println("input: " + input + " result: " + result.equals(expected));
        System.out.println("printout:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        testUnitPascalsTriangle(1, new ArrayList<>(List.of(List.of(1))));

        testUnitPascalsTriangle(2, new ArrayList<>(List.of(
                List.of(1),
                List.of(1, 1))));
        testUnitPascalsTriangle(3, new ArrayList<>(List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1))));
        testUnitPascalsTriangle(4, new ArrayList<>(List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1)
        )));
        testUnitPascalsTriangle(5, new ArrayList<>(List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        )));


    }


}
