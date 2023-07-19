package programmers.Level1;

public class 음양_더하기 {

    public static int solution(int[] absolutes, boolean[] signs) {

        int sum = 0;

        for (int x = 0; x < signs.length; x++) {
            if (signs[x]) {
                sum += absolutes[x];
            } else {
                sum -= absolutes[x];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
    }
}
