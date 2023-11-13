package lowcodemendix.developer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FindTheOddIntTest {
    @Test
    public void testFindTheOdd() {
        // Test case 1: The number 7 appears an odd number of times
        assertEquals(7, FindTheOddInt.FindTheOdd(new int[]{7}));

        // Test case 2: The number 0 appears an odd number of times
        assertEquals(0, FindTheOddInt.FindTheOdd(new int[]{0}));

        // Test case 3: The number 2 appears an odd number of times
        assertEquals(2, FindTheOddInt.FindTheOdd(new int[]{1, 1, 2}));

        // Test case 4: The number 0 appears an odd number of times
        assertEquals(0, FindTheOddInt.FindTheOdd(new int[]{0, 1, 0, 1, 0}));

        // Test case 5: The number 4 appears an odd number of times
        assertEquals(4, FindTheOddInt.FindTheOdd(new int[]{1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1}));
    }
}
