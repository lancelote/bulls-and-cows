package stage3.hw03;

import java.util.Scanner;

public class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder sb = new StringBuilder();

        for (String word : strings) {
            for (char letter : word.toCharArray()) {
                if (Character.isLetter(letter)) {
                    sb.append(letter);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
