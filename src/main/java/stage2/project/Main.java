package stage2.project;

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
    String secret = "9305";

    private static String getGuess() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    Grade getGrade(String guess) {
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == this.secret.charAt(i)) {
                bulls += 1;
            } else if (this.secret.indexOf(guess.charAt(i)) != -1) {
                cows += 1;
            }
        }

        return new Grade(bulls, cows);
    }

    private static void printGrade(Grade grade) {
        if (grade.bulls == 0 && grade.cows == 0) {
            System.out.println("None");
        } else {
            System.out.printf("%d bulls and %d cows", grade.bulls, grade.cows);
            System.out.println();
        }
    }

    void play() {
        String guess = getGuess();
        Grade grade = getGrade(guess);
        printGrade(grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
