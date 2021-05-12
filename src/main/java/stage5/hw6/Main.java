package stage5.hw6;

import java.util.*;

public class Main {
    public static int findSeedGreaterThan(int minSeed, int numbersToPass, double limit) {
        Random random;
        int seed = minSeed;

        seedSearch:
        for (;; seed++) {
            random = new Random(seed);

            for (int i = 0; i < numbersToPass; i++) {
                double number = random.nextGaussian();
                if (number > limit) {
                    continue seedSearch;
                }
            }

            return seed;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();

        System.out.println(findSeedGreaterThan(k, n, m));
    }
}
