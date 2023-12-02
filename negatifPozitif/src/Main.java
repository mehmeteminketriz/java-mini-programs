import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcının Girdiği Sayının Negatif mi, Pozitif mi Olduğunu Bulan Java Programı

        Scanner input = new Scanner(System.in);

        System.out.print("lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi<0){
            System.out.println(sayi+" sayısı negatif.");
        }else if (sayi==0){
            System.out.println(sayi+" sayısı ne pozitif ne negatif.");
        }else {
            System.out.println(sayi+" sayısı pozitif.");
        }
    }
}