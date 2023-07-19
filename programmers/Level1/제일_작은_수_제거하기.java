package programmers.Level1;

import java.util.Arrays;

public class 제일_작은_수_제거하기 {

    public static int[] solution(int[] arr) {

        int len = arr.length;
        int[] answer = new int[len - 1];
        int Min = (int) 21e8;
        int key = 0;
        int cnt = 0;

        if (len == 1) {

            return new int[]{-1};
        } else {
            for (int i = 0; i < len; i++) {
                if (Min > arr[i]) {
                    Min = arr[i];
                    key = i;
                }
            }
            for (int i = 0; i < len; i++) {
                if (i == key) continue;
                answer[cnt++] = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
    }
}
