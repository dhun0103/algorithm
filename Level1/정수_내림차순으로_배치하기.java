package Level1;

import java.util.Arrays;
import java.util.Collections;

public class 정수_내림차순으로_배치하기 {

    public static long solution(long n) {

        long len = Long.toString(n).length();
        Long[] arr = new Long[(int) len];

        for (int i = 0; i < len; i++) {
            arr[i] = (n % 10);
            n /= 10;
        }

        Arrays.sort(arr, Collections.reverseOrder());
        long sum = 0;
        long key = 1;

        for (int i = (int) (len - 1); i >= 0; i--) {
            sum += (key * arr[i]);
            key *= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(solution(118372));
    }
}
