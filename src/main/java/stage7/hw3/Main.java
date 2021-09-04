package stage7.hw3;

public class Main {
    public static void main(String... args) {
        Printer printer = new ConsolePrinter();
        printer.print();
    }
}

class ConsolePrinter implements Printer {
}

interface Printer {
    default void print() {
        System.out.println("This is a default message");
    }
}
