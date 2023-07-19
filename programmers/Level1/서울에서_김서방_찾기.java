package programmers.Level1;

public class 서울에서_김서방_찾기 {

    public static String solution(String[] seoul) {

        int key = 0;
        for (int x = 0; x < seoul.length; x++) {
            if (seoul[x].equals("Kim")) {
                key = x;
                break;
            }
        }
        return "김서방은 " + key + "에 있다";
    }

    public static void main(String[] args) {

        System.out.println(solution(new String[]{"jane", "kim", "Kim"}));
    }
}
