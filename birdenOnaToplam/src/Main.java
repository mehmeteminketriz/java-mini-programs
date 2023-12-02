import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1’den N’e Kadar Olan Sayıların Toplamını Bulan Java Programı

        Scanner input = new Scanner(System.in);
        long toplam = 0;
        System.out.print("1 den kaça kadar toplayalım: ");
        long uzunluk = input.nextLong();



        for (long i = 1; i<=uzunluk; i++){
            toplam += i;
        }
        System.out.println("1 den "+uzunluk+" sayısına kadar sayıların toplam: "+ toplam+" dır.");
    }
}