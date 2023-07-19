package programmers.Level1;

public class 문제_2016년 {

    public static String solution(int a, int b) {

        String[] str = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] arr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        for (int i = 0; i < a - 1; i++) {
            sum += arr[i];
        }
        sum += b;

        return str[sum % 7];
    }

    public static void main(String[] args) {

        System.out.println(solution(5, 24));
    }
}
