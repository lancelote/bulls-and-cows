package stage5.hw5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MainTest {
    @ParameterizedTest
    @CsvSource({
        "7,9,4,100,8,64",
        "0,100,5,1000,18,270",
        "0,100,1000,1000,5,993",
        "0,100,10000,1000,0,999"
    })
    void testFindMinMax(int a, int b, int n, int k, int seedNum, int seedMax) {
        Seed seed = Main.findMinMax(a, b, n, k);

        assertEquals(seed.seedNum, seedNum);
        assertEquals(seed.seedMax, seedMax);
    }
}
