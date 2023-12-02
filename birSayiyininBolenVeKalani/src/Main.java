import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
        System.out.println("_____________________________________");
        System.out.print("İşlem yapmak istediğiniz sayıyı giriniz: ");
        int sayi = input.nextInt(); // 55

        System.out.print("Hangi sayıya bölmek istiyorsunuz: ");
        int islemSayi = input.nextInt(); // 2
        int bolum = sayi/islemSayi; // 55/2 = 27 kalan 1

        int kalan =sayi-(islemSayi*bolum);

        System.out.println(sayi+ ", "+islemSayi+ ", ile işleme girince bölüm "+bolum+" kalan ise "+kalan+" olur");
    }
}