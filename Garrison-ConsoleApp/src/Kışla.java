public class Kışla {
    public String Ad_Soyad;

    public String  rutbe;

    public String memleket;

    public Kışla(String Ad_Soyad, String rutbe, String memleket){
        this.Ad_Soyad = Ad_Soyad;
        this.memleket = memleket;
        this.rutbe = rutbe;
    }

    public void emirAl(){
        System.out.println(rutbe+ " " + Ad_Soyad + " emir alır.");
    }

    public void tekmilVer(){
        System.out.println(rutbe + " " + Ad_Soyad +" " +memleket + " Emret komutanım.");
    }

    public void emirVer(){
        System.out.println(rutbe + " " + Ad_Soyad + " emri verir.");
    }

}
