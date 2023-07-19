package programmers.Level1;

public class 수박수박수박수박수박수 {

    public static String solution(int n) {

        StringBuilder str = new StringBuilder();
        for (int x = 0; x < n; x++) {
            if (x % 2 == 0) str.append("수");
            else str.append("박");
        }

        return str.toString();
    }

    public static void main(String[] args) {

        System.out.println(solution(4));
    }
}
