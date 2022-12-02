package Level1;

import java.util.Scanner;

public class 직사각형_별찍기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
