package stage2.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MainTest {
    @ParameterizedTest
    @CsvSource({
            "9305,4,0",
            "3059,0,4",
            "3590,0,4",
            "5930,0,4",
            "5039,0,4",
            "9306,3,0",
            "9385,3,0",
            "9505,3,1",
            "1305,3,0",
            "9350,2,2",
            "9035,2,2",
            "5309,2,2",
            "3905,2,2",
            "1293,0,2",
            "5012,0,2",
            "3512,0,2",
            "5129,0,2",
            "1246,0,0",
            "7184,0,0",
            "4862,0,0",
            "2718,0,0",
            "1111,0,0",
            "9999,1,3",
            "9955,2,2",
    })
    void testGetGrade(String guess, int bulls, int cows) {
        Game game = new Game();
        Grade grade = game.getGrade(guess);

        assertEquals(bulls, grade.bulls);
        assertEquals(cows, grade.cows);
    }
}
