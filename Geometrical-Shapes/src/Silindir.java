public class Silindir extends Boyutlu_Sekil{

    private double tabanyaricapi;
    private double yukseklik;


    public Silindir(double tabanyaricapi, double yukseklik) {
        this.tabanyaricapi = tabanyaricapi;
        this.yukseklik = yukseklik;
    }

    @Override
    public double alan() {
        return 2 * tabanyaricapi + yukseklik * tabanyaricapi;
    }

    @Override
    public double cevre() {
        return 2 * Math.PI * tabanyaricapi + Math.PI * tabanyaricapi * yukseklik;
    }

    @Override
    public double hacim() {
        return Math.PI * tabanyaricapi * tabanyaricapi * yukseklik;
    }
}
