public class Tasiyici {

    private int Gozadedi;

    private int[] Kapasite;

    private boolean[] GozDurumu;

    private int[] GozdekiMiktari;

    public Tasiyici(int KacGoz, int kapasite){
        Gozadedi = KacGoz;
        Kapasite = new int[Gozadedi];
        GozDurumu = new boolean[Gozadedi];
        GozdekiMiktari = new int[Gozadedi];

        for (int i=0; i < Gozadedi; i++){
            Kapasite[i] = kapasite;
            GozDurumu[i] = true;
            GozdekiMiktari[i] = 0;
        }
    }

    public Tasiyici(int KacGoz){
        this(KacGoz, 15);
    }

    public void EsyaYerlestir(int GozNo, int Adet)
    {
        if (GozDurumu[GozNo])
        {
            if (GozdekiMiktari[GozNo]+Adet < Kapasite[GozNo])
            {
                GozdekiMiktari[GozNo] += Adet;
                System.out.printf("Yeni Miktar :" + " " + GozdekiMiktari[GozNo] + "\n");
            }
            else
            {
                int eklenen = Kapasite[GozNo] - GozdekiMiktari[GozNo];
                GozdekiMiktari[GozNo] += eklenen;
                System.out.print("Kapasite Doldu eklenen miktar: " + eklenen + "\n");
            }
        }
        else {
            System.out.print("Eşya eklenemedi, Gözler Kapalı.");
        }
    }
    public void EsyaAl(int GozNo, int Adet)
    {
    if (GozDurumu[GozNo])
        {
            if (Adet <= Kapasite[GozNo])
            {
                GozdekiMiktari[GozNo] -= GozdekiMiktari[GozNo] - Adet;
                System.out.printf("Kalan Miktar : " + GozdekiMiktari[GozNo]);
            }
            else{
                System.out.printf("Girilen Adet Miktardan Fazla -->" + " Miktar : " + GozdekiMiktari[GozNo] + "\n");
                System.out.print("Lütfen Doğru Miktarda Giriniz. \n");
                System.out.print("İşlem Başarısız. \n");
            }
        }
    else{
        System.out.print("Eşya Alınamadı, Gözü Kapalı.");
        }
    }

    public void GozAc(int GozNo){
        GozDurumu[GozNo] = true;
    }
    public void GozKapali(int GozNo){
        GozDurumu[GozNo] = false;
    }

    public String Rapor() {
        String rapor = "";
        System.out.println();
        for(int i = 0;i<Gozadedi;i++){
            System.out.println(i + ". gözdeki esya sayısı:" + GozdekiMiktari[i]  + "/" + Kapasite[i]);
            rapor += i + ": " + GozdekiMiktari[i] + "/" + Kapasite[i] + " ";
        }
        return rapor;
    }

    public String Rapor(int GozNo) {
        System.out.println(GozNo + ". gözdeki esya sayısı:" + GozdekiMiktari[GozNo]  + "/" + Kapasite[GozNo]);
        return  GozdekiMiktari[GozNo] + "/" + Kapasite[GozNo];
    }
}



