package stage3.project;

import java.util.Scanner;

public class Main {
    private static int getSecretLength() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static StringBuilder getRandomData() {
        long pseudoRandomNumber = System.nanoTime();
        StringBuilder sb = new StringBuilder(String.valueOf(pseudoRandomNumber));
        sb.reverse();
        return sb;
    }

    private static String getSecret(int secretLength) {
        StringBuilder secret = new StringBuilder(secretLength);
        StringBuilder randomData = getRandomData();
        int i = 0;

        while (secret.length() < secretLength) {
            if (i == randomData.length()) {
                randomData = getRandomData();
                i = 0;
            }

            if (secret.toString().indexOf(randomData.charAt(i)) == -1) {
                secret.append(randomData.charAt(i));
            }

            i++;
        }

        return secret.toString();
    }

    public static void main(String[] args) {
        int secretLength = getSecretLength();
        if (secretLength > 10) {
            System.out.printf("Error: can't generate a secret number with a length of %d" +
                    " because there aren't enough unique digits.\n", secretLength);
        } else {
            String secret = getSecret(secretLength);
            System.out.printf("The random secret number is %s.", secret);
        }
    }
}

