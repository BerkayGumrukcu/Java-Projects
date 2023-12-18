// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Kare kare = new Kare(12);
        Dikdortgen dikdortgen = new Dikdortgen(8,6);
        Daire daire = new Daire(9);
        Kup kup = new Kup(7);
        Silindir silindir = new Silindir(4,12);


        System.out.printf("\n");
        System.out.println("Kare Alanı : " + kare.alan());
        System.out.println("Kare Çevresi : " + kare.cevre());
        System.out.printf("\n");
        System.out.println("Daire Alanı : " + daire.alan());
        System.out.println("Daire Çevresi : " + daire.cevre());
        System.out.printf("\n");
        System.out.println("Dikdörtgen Alanı : " + dikdortgen.alan());
        System.out.println("Dikdörtgen Çevresi : " + dikdortgen.cevre());
        System.out.printf("\n");
        System.out.println("Küp Alanı : " + kup.alan());
        System.out.println("Küp Çevresi : " + kup.cevre());
        System.out.println("Küp Hacmi : " + kup.hacim());
        System.out.printf("\n");
        System.out.println("Silindir Alanı : " + silindir.alan());
        System.out.println("Silindir Çevresi : " + silindir.cevre());
        System.out.println("Silindir Hacmi : " + silindir.hacim());
    }
}