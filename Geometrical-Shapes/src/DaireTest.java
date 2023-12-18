import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DaireTest {

    @Test
    public void testAlan() {
        Daire daire = new Daire(10);
        double expectedAlan = Math.PI * Math.pow(5, 2);
        assertEquals(expectedAlan, daire.alan(), 0.001);
    }

    @Test
    public void testCevre() {
        Daire daire = new Daire(10);
        double expectedCevre = Math.PI * 10;
        assertEquals(expectedCevre, daire.cevre(), 0.001);
    }
}