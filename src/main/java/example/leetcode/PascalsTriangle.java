package example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        var x = generate(5);
        System.out.println("stop");
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangleRows = new ArrayList<>();
        if (numRows == 1) return new ArrayList<>(Arrays.asList(Arrays.asList(1)));

        triangleRows.add(Arrays.asList(1));
        triangleRows.add(Arrays.asList(1, 1));
        for (int rowIndex = 2; rowIndex < numRows; rowIndex++) {
            List<Integer> rowNumbers = new ArrayList<>(rowIndex);
            rowNumbers.add(1);
            int rowFulfillment = rowIndex - 1;
            for (int fulfillmentIndex = 0; fulfillmentIndex < rowFulfillment; fulfillmentIndex++) {
                rowNumbers.add(triangleRows.get(rowIndex - 1).get(fulfillmentIndex)
                        + triangleRows.get(rowIndex - 1).get(fulfillmentIndex + 1));
            }
            rowNumbers.add(1);
            triangleRows.add(rowNumbers);
        }
        return triangleRows;
    }
}
