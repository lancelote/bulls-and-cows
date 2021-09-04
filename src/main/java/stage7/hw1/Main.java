package stage7.hw1;

public class Main {}

class ConsoleWriter implements Printer, Notifier {
    public void greeting() {
        Printer.super.greeting();
    }
}

interface Printer {
    default void greeting() {
        System.out.println("Printer is ready");
    }
}

interface Notifier {
    default void greeting() {
        System.out.println("Notifier is ready");
    }
}
