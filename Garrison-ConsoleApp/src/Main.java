import static org.junit.Assert.*;
import org.junit.Test;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Askerler asker1 = new Askerler("Abdullah Bahar", "Er","Bulgaristan");
        Askerler asker2 = new Askerler("Batuhan Kürklü", "Er", "Aksaray");
        Askerler asker3 = new Askerler("Berkay Gümrükçü", "Onbaşı", "Trabzon");
        Askerler asker4 = new Askerler("Kubilay Baltaoğlu", "Onbaşı", "Angara");
        Askerler asker5 = new Askerler("Cemil Öztürk", "Uzman Çavuş", "Trabzon");
        Askerler asker6 = new Askerler("Aziz Emin Yılmaz", "Uzman Çavuş", "Ankara/Çankırı");

        ustRutbeliler tegmen = new ustRutbeliler("Zeynep Buse Rençber", "Teğmen", "Kastamonu");
        ustRutbeliler yuzbasi = new ustRutbeliler("Cem Kasapbaşı", "Yüzbaşı", "Trabzon");
        ustRutbeliler binbasi = new ustRutbeliler("Halil Özçelik", "Binbaşı", "Trabzon");
        ustRutbeliler usttegmen = new ustRutbeliler("Onur Paça", "Üsteğmen", "Trabzon");
        General Orgeneral = new General("Olcay", "Orgeneral", "Trabzon");

        asker1.emirAl();
        asker2.emirAl();
        asker3.emirAl();
        asker4.emirVer();
        asker5.tekmilVer();
        asker6.emirVer();
        tegmen.emirVer();
        yuzbasi.emirVer();
        usttegmen.emirAl();
        binbasi.tekmilVer();



    }
}