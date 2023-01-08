package Level1;

import java.util.HashMap;

public class 완주하지_못한_선수 {

    public static String solution(String[] participant, String[] completion) {

        String str = "";

        HashMap<String, Integer> temp = new HashMap<>();
        for (String player : participant) temp.put(player, temp.getOrDefault(player, 0) + 1);
        for (String player : completion) temp.put(player, temp.get(player) - 1);

        for (String key : temp.keySet()) {
            if (temp.get(key) != 0) {
                str = key;
            }
        }
        return str;
    }

    public static void main(String[] args) {

        String[] a = {"aa", "bb", "cc"};
        String[] b = {"aa", "cc"};

        System.out.println(solution(a, b));
    }
}
