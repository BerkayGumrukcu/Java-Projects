import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SilindirTest {

    @Test
    public void testAlan() {
        Silindir prizma = new Silindir(10, 5);
        double expectedAlan = 250;
        assertEquals(expectedAlan, prizma.alan(), 0.001);
    }

    @Test
    public void testHacim() {
        Silindir prizma = new Silindir(10, 5);
        double expectedHacim = 500;
        assertEquals(expectedHacim, prizma.hacim(), 0.001);
    }
}

