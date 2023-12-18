import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KupTest {

    @Test
    public void testAlan() {
        Kup kup = new Kup(5);
        double expectedAlan = 150;
        assertEquals(expectedAlan, kup.alan(), 0.001);
    }

    @Test
    public void testHacim() {
        Kup kup = new Kup(5);
        double expectedHacim = 125;
        assertEquals(expectedHacim, kup.hacim(), 0.001);
    }
}

