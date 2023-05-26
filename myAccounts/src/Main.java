import java.util.Scanner;
import java.io.*;

public class Main {
    private static final String KULLANICI_ADI = "a";
    private static final String SIFRE = "1";
    private static final String DOSYA_ADI = "hesaplar.txt";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hesap Yönetimi Uygulamasına Hoş Geldiniz!");

        boolean girisBasarili = girisYap(input);
        if (girisBasarili) {
            System.out.println("Giriş başarılı! Hesap bilgilerine erişebilirsiniz.");

            System.out.println("1. Hesap Bilgilerini Görüntüle");
            System.out.println("2. Hesap Ekle");
            System.out.println("3. Çıkış");

            int secim = input.nextInt();
            input.nextLine(); // Boşluğu oku

            switch (secim) {
                case 1:
                    hesapBilgileriniGoruntule();
                    break;
                case 2:
                    hesapEkle(input);
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız!");
                    break;
            }
        } else {
            System.out.println("Giriş başarısız! Program sonlandırılıyor.");
        }
    }

    public static boolean girisYap(Scanner input) {
        System.out.print("Kullanıcı adınızı girin: ");
        String kullaniciAdi = input.nextLine();

        System.out.print("Şifrenizi girin: ");
        String sifre = input.nextLine();

        if (kullaniciAdi.equals(KULLANICI_ADI) && sifre.equals(SIFRE)) {
            return true;
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre!");
            return false;
        }
    }

    public static void hesapBilgileriniGoruntule() {
        try {
            FileReader fileReader = new FileReader(DOSYA_ADI);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String satir;
            while ((satir = bufferedReader.readLine()) != null) {
                String[] bilgiler = satir.split(",");
                String platform = bilgiler[0];
                String kullaniciAdi = bilgiler[1];
                String sifre = bilgiler[2];
                String eposta = bilgiler[3];
                String telefon = bilgiler[4];

                System.out.println("Platform: " + platform);
                System.out.println("Kullanıcı Adı: " + kullaniciAdi);
                System.out.println("Şifre: " + sifre);
                System.out.println("E-posta: " + eposta);
                System.out.println("Telefon: " + telefon);
                System.out.println("-------------------------------------");
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Hesap bilgileri okunamadı: " + e.getMessage());
        }
    }


    public static void hesapEkle(Scanner input) {
        try {
            FileWriter fileWriter = new FileWriter(DOSYA_ADI, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.print("Platform adını girin: ");
            String platform = input.nextLine();

            System.out.print("Kullanıcı adını girin: ");
            String kullaniciAdi = input.nextLine();

            System.out.print("Şifreyi girin: ");
            String sifre = input.nextLine();

            System.out.print("E-posta adresini girin: ");
            String eposta = input.nextLine();

            System.out.print("Telefon numarasını girin: ");
            String telefon = input.nextLine();

            bufferedWriter.write(platform + "\nK.adi: " + kullaniciAdi + "\nŞifre: "
                    + sifre + "\nE-posta: " + eposta + "\nTelefon: " + telefon + "\n _____________________" +
                    "_____________________\n");
            bufferedWriter.newLine();

            bufferedWriter.close();

            System.out.println("Hesap bilgileri başarıyla kaydedildi.");
        } catch (IOException e) {
            System.out.println("Hesap bilgileri kaydedilemedi: " + e.getMessage());
        }
    }
}
