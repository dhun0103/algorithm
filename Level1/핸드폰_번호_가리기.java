package Level1;

public class 핸드폰_번호_가리기 {

    public static String solution(String phone_number) {

        String str = "";
        int len = phone_number.length();

        for (int x = 0; x < len - 4; x++) {
            str += "*";
        }
        return str + phone_number.substring(len - 4);
    }

    public static void main(String[] args) {

        System.out.println(solution("67457867"));
    }
}
