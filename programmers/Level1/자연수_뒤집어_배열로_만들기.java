package programmers.Level1;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {

    public static int[] solution(long n) {

        String s = Long.toString(n);
        int[] arr = new int[s.length()];

        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[cnt++] = Integer.parseInt(s.substring(i, i + 1));
        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(12345)));
    }
}
