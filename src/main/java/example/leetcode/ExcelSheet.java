package example.leetcode;



//czas realizacji 20-30 min
//https://leetcode.com/problems/excel-sheet-column-number/description/
public class ExcelSheet {


    public static int titleToNumber(String columnTitle) {
        int letterPosition = columnTitle.length();
        int columnNumber = 0;
        for (int index = 0; index < columnTitle.length(); index++) {
            int letter = columnTitle.charAt(index) - 64;
            columnNumber += (int)Math.pow(26, letterPosition - 1) * letter;
            letterPosition--;
        }

        return columnNumber;
    }

    static void unitTestTitleToNumber(String input, int expected) {
        System.out.print("input = " + input);
        System.out.println(" ");
        System.out.print("expected = " + expected);
        System.out.println(" = " + (titleToNumber(input) == expected));
    }

    public static void main(String [] args) {
        unitTestTitleToNumber("AA", 27);
        unitTestTitleToNumber("AAA", 703);
        unitTestTitleToNumber("ZY", 701);
    }
}
