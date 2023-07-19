package programmers.Level1;

public class 이상한_문자_만들기 {

    public static String Solution(String s) {

        String[] str = s.split("");
        String answer = "";
        int cnt = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("")) {
                answer += str[i];
                cnt = 0;
            } else {
                answer += (cnt % 2 == 0) ? str[i].toUpperCase() : str[i].toLowerCase();
                cnt++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Solution("try hello world"));
    }
}
