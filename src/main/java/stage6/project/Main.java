package stage6.project;

import java.util.Random;
import java.util.Scanner;


class Grade {
    int bulls;
    int cows;

    Grade(int bulls, int cows) {
        this.bulls = bulls;
        this.cows = cows;
    }
}

class Game {
    int turn = 1;
    String secret;

    private static int getSecretLength() {
        System.out.println("Input the length of the secret code:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getSymbolsRangeLength() {
        System.out.println("Input the number of possible symbols in the code:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String getSymbolRange(int symbolsRangeLength, String[] allowedChars) {
        if (symbolsRangeLength < 10) {
            return "0-" + allowedChars[symbolsRangeLength - 1];
        } else {
            return "0-9, a-" + allowedChars[symbolsRangeLength - 1];
        }
    }

    private static String getSecret(int secretLength, int symbolsRangeLength) {
        assert secretLength > 0 && secretLength <= 36;
        assert symbolsRangeLength > 0 && symbolsRangeLength <= 36;
        assert symbolsRangeLength > secretLength;

        Random random = new Random();
        StringBuilder secret = new StringBuilder(secretLength);
        String[] allowedChars = "0123456789abcdefghijklmnopqrstuvwxyz".split("");

        while (secret.length() < secretLength) {
            int randomIndex = random.nextInt(symbolsRangeLength);
            String digit = allowedChars[randomIndex];
            if (secret.indexOf(digit) == -1) {
                secret.append(digit);
            }
        }

        String secretAsStars = "*".repeat(secretLength);
        String symbolRange = getSymbolRange(symbolsRangeLength, allowedChars);
        System.out.printf("The secret is prepared: %s (%s).", secretAsStars, symbolRange);
        System.out.println();

        return secret.toString();
    }

    private static String getGuess() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private Grade getGrade(String guess) {
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == secret.charAt(i)) {
                bulls += 1;
            } else if (secret.indexOf(guess.charAt(i)) != -1) {
                cows += 1;
            }
        }

        return new Grade(bulls, cows);
    }

    private void printGrade(Grade grade) {
        String gradeString;

        if (grade.bulls != 0 && grade.cows != 0) {
            gradeString = String.format("%d bull(s) and %d cow(s)", grade.bulls, grade.cows);
        } else if (grade.bulls != 0) {
            gradeString = String.format("%d bull(s)", grade.bulls);
        } else if (grade.cows != 0) {
            gradeString = String.format("%d cow(s)", grade.cows);
        } else {
            gradeString = "None";
        }

        System.out.printf("Grade: %s", gradeString);
        System.out.println();
    }

    void play() {
        String guess;

        int secretLength = getSecretLength();
        while (secretLength > 36) {
            System.out.println("Error: secret length cannot be greater than 36");
            secretLength = getSecretLength();
        }

        int symbolsRangeLength = getSymbolsRangeLength();
        while (symbolsRangeLength > 36 || symbolsRangeLength < secretLength) {
            if (symbolsRangeLength > 36) {
                System.out.println("Error: symbols range length cannot be greater than 36");
            } else {
                System.out.println("Error: symbols range length cannot be smaller than secret length");
            }
            symbolsRangeLength = getSymbolsRangeLength();
        }

        secret = getSecret(secretLength, symbolsRangeLength);
        System.out.println("Okay, let's start a game!");

        do {
            System.out.printf("Turn %d:\n", turn);
            guess = getGuess();
            Grade grade = getGrade(guess);
            printGrade(grade);
            turn += 1;
        } while (!guess.equals(secret));

        System.out.println("Congratulations! You guessed the secret code.");
    }
}

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
