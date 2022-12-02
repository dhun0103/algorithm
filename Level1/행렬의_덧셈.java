package Level1;

public class 행렬의_덧셈 {

    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] result = new int[arr1.length][arr1[0].length];

        for (int y = 0; y < arr1.length; y++) {
            for (int x = 0; x < arr1[0].length; x++) {
                result[y][x] = arr1[y][x] + arr2[y][x];
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
