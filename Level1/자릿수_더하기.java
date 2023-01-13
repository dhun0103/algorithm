package Level1;

public class 자릿수_더하기 {

    public static int solution(int n) {

        int answer = 0;
        String s = Integer.toString(n);

        for (int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(s.substring(i, i + 1));
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(1234));
    }
}
