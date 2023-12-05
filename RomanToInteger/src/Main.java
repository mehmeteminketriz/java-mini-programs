import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sayiMetin;

        System.out.println("*****Roman Rakamlarını Sayıya Çevirme*****");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Sayıyı Romen İfadelerle Giriniz: ");
        sayiMetin = scanner.nextLine().toUpperCase();

        if (sayiGecerliMi(sayiMetin)) {
            int sonuc = metniSayiyaCevirme(sayiMetin);
            if (sonuc != -1) {
                System.out.println("Sayının karşılığı: " + sonuc);
            } else {
                System.out.println("Bir hata oluştu.");
            }
        } else {
            System.out.println("Romen rakamlarını farklı bir şekilde yazdınız");
        }
    }

    public static boolean sayiGecerliMi(String sayiMetin) {
        String gecerliHarfler = "IVXLCDM";
        for (int i = 0; i < sayiMetin.length(); i++) {
            char currentChar = sayiMetin.charAt(i);
            if (gecerliHarfler.indexOf(currentChar) == -1) {
                return false;
            }
        }
        return true;
    }

    public static int metniSayiyaCevirme(String sayiMetin) {
        int ans = 0;
        int prevNum = 0;

        for (int i = sayiMetin.length() - 1; i >= 0; i--) {
            int num = 0;
            switch (sayiMetin.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }

            if (num < prevNum) {
                ans -= num;
            } else {
                ans += num;
            }

            prevNum = num;
        }

        return ans;
    }
}
