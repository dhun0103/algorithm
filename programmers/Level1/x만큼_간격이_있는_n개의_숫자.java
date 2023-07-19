package programmers.Level1;

public class x만큼_간격이_있는_n개의_숫자 {

    public static long[] solution(long x, int n) {

        long[] arr = new long[n];
        long num = x;

        for (int i = 0; i < n; i++) {
            arr[i] = num;
            num += x;
        }
        return arr;
    }

    public static void main(String[] args) {

        long[] result = solution(-2, 5);

        for (int x = 0; x < result.length; x++) {
            System.out.println(result[x]);
        }
    }
}
