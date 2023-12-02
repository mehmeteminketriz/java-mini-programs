import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Dizinin elemanlarını kullanıcıdan alalım
         * Daha sonra dizinin içindeki elemanların asal olup olmadığını bulalım
         * Asal olan ve olmayanları ayrı ayrı ayırdıktan sonra ekrana yazdıralım
         */

        System.out.println("-------<Asal Sayı Bulma Programına Hoşgeldiniz.>-------");
        System.out.println("-----------------------<_____>-----------------------");

        int asalToplam = 0; // Girilen sayılardan kaçı asal
        int asalOlmayanToplam = 0; // Girilen sayılardan kaçı asal değil

        String asalSayilar = ""; // Asal olan sayıları yazdırmak için
        String asalOlmayanSayilar = ""; // Asal olmayan sayıları yazdırmak için

        Scanner input = new Scanner(System.in);

        System.out.print("Oluşturmak istediğiniz dizinin eleman sayısını giriniz: ");
        int diziUzunluk = input.nextInt();

        int[] sayilar = new int[diziUzunluk]; // Input ile aldığımız değeri buraya yazıyoruz

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(i + 1 + ". Sayıyı giriniz: ");
            int diziElamanlari = input.nextInt();
            sayilar[i] = diziElamanlari;
        } // Burada kullanıcıdan dizi elemanlarını aldık.

        for (int sayi : sayilar) {
            boolean asalMi = true; // Sayının asal olup olmadığını kontrol etmek için flag

            if (sayi <= 1)
                asalMi = false;
            else {
                for (int j = 2; j <= Math.sqrt(sayi); j++) { // math.sqrt bir sayının karekökünü alır
                    if (sayi % j == 0) {
                        asalMi = false;
                        break;
                    }
                }
            }

            if (asalMi) {
                asalToplam += 1;
                asalSayilar += String.valueOf(sayi) + ", ";
            } else {
                asalOlmayanToplam += 1;
                asalOlmayanSayilar += String.valueOf(sayi) + " ";
            }
        }

        System.out.println("Asal sayılar ile ilgili bilgiler:");
        System.out.println(asalToplam + " tane asal sayı vardı ve bunlar: " + asalSayilar);
        System.out.println("-----------------------<_____>-----------------------");
        System.out.println("Asal olmayan sayılar ile ilgili bilgiler:");
        System.out.println(asalOlmayanToplam + " tane asal olmayan sayı vardı ve bunlar: " + asalOlmayanSayilar);
    }
}
