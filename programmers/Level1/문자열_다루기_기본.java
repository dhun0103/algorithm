package programmers.Level1;

public class 문자열_다루기_기본 {

    public static boolean solution(String s) {

        int len = s.length();

        if (len != 4 && len != 6) return false;
        else {
            String temp = s.replaceAll("[^0-9]", "");

            return temp.equals(s);
        }
    }

    public static void main(String[] args) {

        System.out.println(solution("a123"));
    }
}
