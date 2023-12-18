//DEĞİŞİKLİK YAPILMIŞTIR.
//BAŞKA HİÇBİR KODDA OYNAMA OLMAMIŞTIR.

public class General extends Kışla {


    public General(String Ad_Soyad, String rutbe, String memleket) {
        super(Ad_Soyad, rutbe, memleket);
    }

    @Override
    public void emirVer() {
        super.emirVer();
    }

    @Override
    public void tekmilVer() {
        super.tekmilVer();
    }


    public void emirAl() {
        System.out.printf("General'den yüksek rütbede biri kışlada bulunmamaktadır.");
    }
}
