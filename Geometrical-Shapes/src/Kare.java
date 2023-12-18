public class Kare extends Basit_Sekil {

    private double kenarUzunlugu;

    public Kare(double kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    @Override
    public double alan() {
        return kenarUzunlugu * kenarUzunlugu;
    }

    @Override
    public double cevre() {
        return 4 * kenarUzunlugu;
    }
}
