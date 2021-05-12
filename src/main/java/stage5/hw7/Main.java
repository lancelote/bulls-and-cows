package stage5.hw7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int sumNums(int n, int a, int b) {
        assert n > 0;

        int seed = a + b;
        Random random = new Random(seed);
        int total = 0;

        for (; n > 0; n--) {
            total += random.nextInt(b - a + 1) + a;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sumNums(n, a, b));
    }
}
