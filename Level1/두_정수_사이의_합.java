package Level1;

public class 두_정수_사이의_합 {

    public static long solution(int a, int b) {

        long answer = 0;

        if (a <= b) {
            for (int x = a; x <= b; x++) {
                answer += x;
            }
        } else {
            for (int x = b; x <= a; x++) {
                answer += x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(3, 3));
    }
}
