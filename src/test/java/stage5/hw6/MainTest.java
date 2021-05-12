package stage5.hw6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MainTest {
    @ParameterizedTest
    @CsvSource({
            "0,5,0,38",
            "0,5,-1.5,498666",
            "10000,1,1.9,10000",
    })
    void testFindSeedGreaterThan(int k, int n, double m, int answer) {
        int seed = Main.findSeedGreaterThan(k, n, m);
        assertEquals(seed, answer);
    }
}
