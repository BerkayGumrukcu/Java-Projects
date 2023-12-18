// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        Canta canta1 = new Canta(3);
        KalemKutu kalemKutu1 = new KalemKutu(2);
        Cuzdan cuzdan1 = new Cuzdan(4);
        canta1.EsyaYerlestir(0,12);
        kalemKutu1.EsyaYerlestir(1,10);
        cuzdan1.EsyaYerlestir(0,50);
        cuzdan1.EsyaYerlestir(0,30);
        cuzdan1.EsyaAl(1,15);
        canta1.Rapor();
        kalemKutu1.Rapor();
        cuzdan1.Rapor();
    }
}