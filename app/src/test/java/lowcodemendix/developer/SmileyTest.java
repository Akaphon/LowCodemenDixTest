package lowcodemendix.developer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SmileyTest {
    @Test
    public void testCountSmileys() {
        assertEquals(2, Smiley.countSmileys(new String[] {":)", ";(", ";}", ":-D"}));
        assertEquals(3, Smiley.countSmileys(new String[] {";D", ":-(", ":-)", ";~)"}));
        assertEquals(1, Smiley.countSmileys(new String[] {";]", ":[", ";*", ":$", ";-D"}));
        assertEquals(0, Smiley.countSmileys(new String[] {}));
        assertEquals(0, Smiley.countSmileys(new String[] {";(", ":>", ":}", ":]"}));
    }
}
