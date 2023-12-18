import static org.junit.Assert.*;
import org.junit.Test;

public class KışlaTest {

    @Test
    public void testEmirAl() {
        Kışla asker = new Kışla("Ahmet Mehmet", "Çavuş", "Ankara");
        String expectedOutput = "Çavuş Ahmet Mehmet emir alır.";
        equals(expectedOutput);
        System.out.printf(expectedOutput);
    }

    @Test
    public void testTekmilVer() {
        Kışla asker = new Kışla("Ali Veli", "Yüzbaşı", "İstanbul");
        String expectedOutput = "Yüzbaşı Ali Veli İstanbul Emret komutanım.";
        System.out.printf(expectedOutput);
    }

    @Test
    public void testEmirVer() {
        Kışla asker = new Kışla("Ayşe Fatma", "Teğmen", "İzmir");
        String expectedOutput = "Teğmen Ayşe Fatma emri verir.";
        System.out.printf(expectedOutput);
    }
}

