//Değişiklik Yapılmıştır.

public class Dikdortgen extends Basit_Sekil {

    private double uzunKenar;
    private double kisaKenar;

    public Dikdortgen(double uzunKenar, double kısaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kısaKenar;
    }

    @Override
    public double alan() {
        return uzunKenar * kisaKenar;
    }

    @Override
    public double cevre() {
        return  2 * (uzunKenar + kisaKenar);
    }
}
