package Level1;

public class 짝수와홀수 {

    public static String solution(int num) {

        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {

        String result = solution(3);
        System.out.println(result);
    }
}
