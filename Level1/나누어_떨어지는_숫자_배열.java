package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {

    public static int[] solution(int[] arr, int divisor) {

        List<Integer> temp = new ArrayList<>();
        for (int key : arr) {
            if (key % divisor == 0) temp.add(key);
        }
        Collections.sort(temp);

        if (temp.size() == 0) {
            return new int[]{-1};
        } else {
            return temp.stream().mapToInt(i -> i).toArray();
        }
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
    }
}
