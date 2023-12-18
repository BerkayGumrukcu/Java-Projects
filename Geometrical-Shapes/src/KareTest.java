import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KareTest {

    @Test
    public void testAlan() {
        Kare kare = new Kare(5);
        double expectedAlan = 25;
        assertEquals(expectedAlan, kare.alan(), 0.001);
    }

    @Test
    public void testCevre() {
        Kare kare = new Kare(5);
        double expectedCevre = 20;
        assertEquals(expectedCevre, kare.cevre(), 0.001);
    }
}