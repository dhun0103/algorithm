package Level1;

public class 내적 {

    public static int solution(int[] arr, int[] brr) {

        int sum = 0;

        for (int x = 0; x < arr.length; x++) {
            sum += (arr[x] * brr[x]);
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        System.out.println(solution(a, b));
    }
}
