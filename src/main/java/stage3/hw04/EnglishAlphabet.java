package stage3.hw04;

public class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder alphabet = new StringBuilder();

        for (char letter = 'A'; letter < 'Z'; letter++) {
            alphabet.append(letter);
            alphabet.append(" ");
        }

        alphabet.append('Z');
        return alphabet;
    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }
}
