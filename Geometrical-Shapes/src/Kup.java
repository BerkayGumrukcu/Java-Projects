public class Kup extends Boyutlu_Sekil{

    private double kenarUzunlugu;

    public Kup(double kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    @Override
    public double alan() {
        return 6 * kenarUzunlugu * kenarUzunlugu;
    }

    @Override
    public double cevre() {
        return kenarUzunlugu * 12;
    }

    @Override
    public double hacim() {
        return Math.pow(kenarUzunlugu , 3);
    }
}
