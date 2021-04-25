package stage5.hw4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int u1 = scanner.nextInt();
        int u2 = scanner.nextInt();

        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        double u_length = Math.sqrt(Math.pow(u1, 2) + Math.pow(u2, 2));
        double v_length = Math.sqrt(Math.pow(v1, 2) + Math.pow(v2, 2));
        double dot_product = u1 * v1 + u2 * v2;

        double cosine = dot_product / (u_length * v_length);
        double angle = Math.toDegrees(Math.acos(cosine));

        System.out.println(angle);
    }
}
