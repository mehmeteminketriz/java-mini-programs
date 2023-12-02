import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*100- 50 arasındaki sayıları yazdıran program

        for (int i = 100; i>=50;i--){
            System.out.println("sayı: "+i);
        }*/

        /*1-25 arasındaki çift sayıların 2 katını, tek sayıların 3 katını ekrana yazdıran program

        for (int i=1;i<=25;i++){
            if (i%2==0){
                System.out.println("Sonuç "+i*2);
            // i = i*2 yaptığında artık i sayısı büyük şekilde tekrar dönüyor bu nedenle 1 den 25 e kadar dönmüyor
            }else {
                System.out.println("Sonuç "+i*3);
            }
        }*/

        /* 1-50 arasındaki sayılardan 3e, 5e ve 15e bölünenleri ayrı ayrı toplayan program kodunu yazınız.
        // (Not: 15e bölünüyorsa sayı sadece 15e bölünenlere eklenecek)

        int[] uce_bolunen = new int[0];
        int[] bese_bolunen = new int[0];
        int[] onbese_bolunen = new int[0];
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                int[] yeniListe = new int[uce_bolunen.length + 1];
                System.arraycopy(uce_bolunen, 0, yeniListe, 0, uce_bolunen.length);
                // arraycopy(Object kaynakDizi, int kaynakPozisyon, Object hedefDizi, int hedefPozisyon, int kopyalamaUzunlugu)
                //kaynakDizi: Kopyalanacak olan dizi (kaynak dizi).
                //kaynakPozisyon: Kaynak dizinin başlangıç konumu (kopyalama başlangıç indeksi).
                //hedefDizi: Kopyalanan verinin yerleştirileceği hedef dizi.
                //hedefPozisyon: Hedef dizinin başlangıç konumu (yerleştirme başlangıç indeksi).
                //kopyalamaUzunlugu: Kopyalama işleminin gerçekleştirileceği eleman sayısı.
                yeniListe[uce_bolunen.length] = i;
                uce_bolunen = yeniListe;
            } else if (i % 5 == 0) {
                int[] yeniListe1 = new int[bese_bolunen.length + 1];
                System.arraycopy(bese_bolunen, 0, yeniListe1, 0, bese_bolunen.length);
                yeniListe1[bese_bolunen.length] = i;
                onbese_bolunen = yeniListe1;

            } else if (i % 15 == 0) {
                int[] yeniListe2 = new int[onbese_bolunen.length + 1];
                System.arraycopy(onbese_bolunen, 0, yeniListe2, 0, onbese_bolunen.length);
                yeniListe2[onbese_bolunen.length] = i;
                onbese_bolunen = yeniListe2;
            }
        }
        System.out.println(Arrays.toString(uce_bolunen));
        System.out.println(Arrays.toString(bese_bolunen));
        System.out.println(Arrays.toString(onbese_bolunen));*/

        


    }
}