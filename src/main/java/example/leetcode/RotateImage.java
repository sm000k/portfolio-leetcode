package example.leetcode;
// rotate image leetcode
public class RotateImage {
    public static void rotate(int[][] matrix) {
        int mLen = matrix[0].length;
        int temp = 0;
        for (int i = 0; i < mLen; i++) {
            for (int j = 0; j <= i; j++) {
                temp = matrix[mLen - 1 - i][j];
                matrix[mLen - 1 - i][j] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        System.out.println("upside down");
        for (int i = 0; i < mLen; i++) {
            for (int j = 0; j <= i; j++) {
                temp = matrix [i][j];
                matrix[i][j] = matrix [j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("koniec");
    }


    public void UnitTest(int[][] input, int[][] expected) {

    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
    }
}
