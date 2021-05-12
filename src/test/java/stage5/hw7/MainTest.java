package stage5.hw7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MainTest {
    @ParameterizedTest
    @CsvSource({
            "100,5,10,734"
    })
    void testFindSeedGreaterThan(int n, int a, int b, int answer) {
        int total = Main.sumNums(n, a, b);
        assertEquals(total, answer);
    }
}
