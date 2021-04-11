package stage3.hw05;

public class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        try {
            int element = array[index];
            System.out.println(element * element);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException exception) {
            System.out.println("Exception!");
        }
    }
}
