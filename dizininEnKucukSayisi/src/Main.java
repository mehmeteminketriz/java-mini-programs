import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dizideki en küçük sayıyı bulan java Örneği:

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz: ");
        int uzunluk = input.nextInt();

        double[] sayilar = new double[uzunluk]; // dizi uzunluğu int olmak zorunda
        double enKucuk = Double.MAX_VALUE;
        // ben burada ilk başta max.value yerine sayilar[0] diyeyazdım burada ilk başta dizi boş olduğu için
        // değeri 0 olarak aldı ve sıfır hiç bir zaman diğerlerinden büyük olmadığı için hep sıfır olarak kalıyor.


        for (int i = 0; i < uzunluk; i++) {
            System.out.print(i+1+". sayıyı giriniz: ");
            sayilar[i]= input.nextDouble(); // sayıları virgül kullanrak gir
        }

        for (double sayi:sayilar){
            if (enKucuk>sayi){
                enKucuk = sayi;
            }
        }
        System.out.println("En küçük sayı:"+ enKucuk);

    }
}