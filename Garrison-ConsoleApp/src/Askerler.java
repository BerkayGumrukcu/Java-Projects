public class Askerler extends Kışla{

    public Askerler(String Ad_Soyad, String rutbe, String memleket) {
        super(Ad_Soyad, rutbe, memleket);
    }

    @Override
    public void emirAl() {
        super.emirAl();
    }

    @Override
    public void tekmilVer() {
        super.tekmilVer();
    }

    public void emirVer(){
        System.out.println(rutbe+" "+ Ad_Soyad + " " + memleket + " emir vermeye çalıştı(!)");
    }

}
