import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----<3 sayıyı büyükten küçüğe sıralama programı>---- ");
        int[] sayilar = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + ". sayıyı giriniz: ");
            int sayi = input.nextInt();
            sayilar[i] = sayi;
        }
        int kucuk=0,orta=0,buyuk= 0;
        /*System.out.println("sayılar : "+ sayilar[0]);
        System.out.println("sayılar : "+ sayilar[1]);
        System.out.println("sayılar : "+ sayilar[2]);*/

        if (sayilar[0]<sayilar[1] && sayilar[0]<sayilar[2]){
            kucuk = sayilar[0];
            if (sayilar[1]<sayilar[2]){
                orta = sayilar[1];
                buyuk = sayilar[2];
            }
        }else if (sayilar[1]<sayilar[0] && sayilar[1]<sayilar[2]){
            kucuk = sayilar[1];
            if (sayilar[0]<sayilar[2]){
                orta = sayilar[0];
                buyuk = sayilar[2];
            }
        }else if (sayilar[2]<sayilar[0] && sayilar[2]<sayilar[1]) {
            kucuk = sayilar[2];
            if (sayilar[0]<sayilar[1]){
                orta = sayilar[0];
                buyuk = sayilar[1];
            }
        }
        System.out.println("sayılar büyükten küçüğe: "+buyuk+">"+orta+">"+kucuk+">");

    }
}