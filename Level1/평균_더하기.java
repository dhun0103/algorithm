package Level1;

public class 평균_더하기 {

    public static double solution(int[] arr) {

        int sum = 0;

        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
        }

        return sum / (double) arr.length;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{1, 2, 3, 4}));
    }
}
