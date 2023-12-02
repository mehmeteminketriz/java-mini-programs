import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float urunFiyati, kdv, kdvTutari ;
        System.out.print("Ürün fiyatı giriniz: ");
        urunFiyati = input.nextFloat();
        System.out.print("Ürün KDV oranı giriniz: ");
        kdv = input.nextInt();
        kdvTutari = (urunFiyati*kdv)/100;
        System.out.println("Girdiğiniz ürünün KDV oranı: "+ kdvTutari);
        System.out.println("Ürün KDV dahil: "+(urunFiyati+kdvTutari)+" TL dir");


        }
    }
