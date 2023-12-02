import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n***********KETRİZ Yazılım LTD. ŞTİ. Çalışan Portalı Uygulaması***********\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("İsminizi giriniz: ");
        String isim = scanner.nextLine();

        System.out.print("Soyisminizi giriniz: ");
        String soyisim = scanner.nextLine();

        System.out.print("Başında '0' Olmadan Telefon numaranızı giriniz: ");
        long tlfNo = scanner.nextLong();

        double maas= 11402.32;

        System.out.print("Tecrübenizi giriniz: ");
        int tecrube = scanner.nextInt();

        Calisan calisan = new Calisan(isim,soyisim,tlfNo,maas,tecrube);


        String islemler ="-----------------\nYapmak İstediğiniz İşlemi Seçiniz:\n" +
                "1- Çalışan Bilgilerini Göster\n" +
                "2- Zam Yap\n" +
                "3- Format At";

        System.out.println(islemler);
        int islem = scanner.nextInt();

        switch (islem){
            case 1:
                calisan.calisanBilgileriGoster();
                break;

            case 2:
                calisan.zamYap(0);
                break;

            case 3:
                calisan.formatAt();
                break;

            default:
                System.out.println("Lütfen Geçerli Bir Seçim Yapınız!!");
                break;
        }

    }
}