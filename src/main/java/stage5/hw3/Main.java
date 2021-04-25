package stage5.hw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double sq = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double x1 = (-b - sq) / (2 * a);
        double x2 = (-b + sq) / (2 * a);

        double min_root = Math.min(x1, x2);
        double max_root = Math.max(x1, x2);

        System.out.printf("%f %f", min_root, max_root);
    }
}
