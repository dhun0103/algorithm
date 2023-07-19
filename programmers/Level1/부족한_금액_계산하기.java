package programmers.Level1;

public class 부족한_금액_계산하기 {

    public static long solution(int price, int money, int count) {

        int sum = 0;
        int plus = price;

        for (long x = 0; x < count; x++) {
            sum += plus;
            plus += price;
        }

        if (sum <= money) {
            return 0;
        } else {
            return sum - money;
        }
    }

    public static void main(String[] args) {

        System.out.println(solution(3, 20, 4));
    }
}
