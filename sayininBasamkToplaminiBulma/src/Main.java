import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*// Kullanıcı Tarafından Girilen Sayının Basamakları Toplamını Bulan Java Programı
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int sayi = input.nextInt();

        int sayiUzunluk = String.valueOf(sayi).length();
        System.out.println(sayiUzunluk);*/

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int basamak;

        while (sayi != 0) {
            basamak = sayi % 10; // 45 in 10 a bölümünden kalan 5 tir
            toplam += basamak; // 5 i ekledi
            sayi /= 10; // Sayıyı bir basamak sağa kaydırır burda virgüllü olur ama biz int kullandığımıziçin sondaikni atar.
        }

        System.out.println("Sayının basamaklarının toplamı: " + toplam);


    }
}