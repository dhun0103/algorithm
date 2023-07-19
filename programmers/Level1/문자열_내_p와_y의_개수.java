package programmers.Level1;

public class 문자열_내_p와_y의_개수 {

    public static boolean solution(String s) {

        String str = s.toUpperCase();
        int cnt = 0;

        for (int x = 0; x < str.length(); x++) {

            if (str.charAt(x) == 'P') cnt++;
            else if (str.charAt(x) == 'Y') cnt--;
        }

        if (cnt == 0) return true;
        else return false;
    }

    public static void main(String[] args) {

        System.out.println(solution("pyY"));
    }
}
