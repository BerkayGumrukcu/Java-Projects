import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DikdortgenTest {

    @Test
    public void testAlan() {
        Dikdortgen dikdortgen = new Dikdortgen(5, 8);
        double expectedAlan = 40;
        assertEquals(expectedAlan, dikdortgen.alan(), 0.001);
    }

    @Test
    public void testCevre() {
        Dikdortgen dikdortgen = new Dikdortgen(5, 8);
        double expectedCevre = 26;
        assertEquals(expectedCevre, dikdortgen.cevre(), 0.001);
    }
}

