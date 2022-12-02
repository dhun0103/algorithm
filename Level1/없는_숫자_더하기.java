package Level1;

public class 없는_숫자_더하기 {

    public static int solution(int[] numbers) {

        int[] check = new int[10];
        int sum = 0;

        for (int x = 0; x < numbers.length; x++) {
            check[numbers[x]]++;
        }

        for (int x = 0; x < 10; x++) {
            if (check[x] == 0) {
                sum += x;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{4, 5, 6, 7, 8, 9, 0}));
    }
}
