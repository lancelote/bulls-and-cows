package stage5.hw5;

import java.util.*;

class Seed {
    int seedNum;
    int seedMax;

    public Seed(int seedNum, int seedMax) {
        this.seedNum = seedNum;
        this.seedMax = seedMax;
    }
}

public class Main {
    public static Seed findMinMax(int a, int b, int n, int k) {
        Random random;

        int minSeed = a;
        int minSeedMaximum = Integer.MAX_VALUE;

        for (int seed = a; seed < b; seed++) {
            random = new Random(seed);
            int seedMaximumNum = 0;

            for (int i = 0; i < n; i++) {
                int num = random.nextInt(k);
                if (num > seedMaximumNum) {
                    seedMaximumNum = num;
                }
            }

            if (seedMaximumNum < minSeedMaximum) {
                minSeedMaximum = seedMaximumNum;
                minSeed = seed;
            }
        }

        return new Seed(minSeed, minSeedMaximum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Seed minSeed = findMinMax(a, b, n, k);

        System.out.println(minSeed.seedNum);
        System.out.println(minSeed.seedMax);
    }
}
