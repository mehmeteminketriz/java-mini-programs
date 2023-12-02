import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean devam = true;

        while (devam) {
            int matematik, turkce, fen, tarih, beden; // NOTLAR
            int matematikk, turkcek, fenk, tarihk, bedenk; // DERS KREDİLERİ

            System.out.println("_____E-okul uygulamasına başarıyla giriş yaptınız._____");

            System.out.print("Matematik notunu gir: ");
            matematik = input.nextInt();
            System.out.print("Matematik ders kredisini gir: ");
            matematikk = input.nextInt();

            System.out.print("Türkçe notunu gir: ");
            turkce = input.nextInt();
            System.out.print("Türkçe ders kredisini gir: ");
            turkcek = input.nextInt();

            System.out.print("Fen Ve Teknoloji notunu gir: ");
            fen = input.nextInt();
            System.out.print("Fen Ve Teknoloji ders kredisini gir: ");
            fenk = input.nextInt();

            System.out.print("Tarih notunu gir: ");
            tarih = input.nextInt();
            System.out.print("Tarih ders kredisini gir: ");
            tarihk = input.nextInt();

            System.out.print("Beden Eğitimi notunu gir: ");
            beden = input.nextInt();
            System.out.print("Beden Eğitimi ders kredisini gir: ");
            bedenk = input.nextInt();

            float agirlikliNot0 = matematik * matematikk;
            float agirlikliNot1 = turkce * turkcek;
            float agirlikliNot2 = fen * fenk;
            float agirlikliNot3 = tarih * tarihk;
            float agirlikliNot4 = beden * bedenk;

            float tumAgirlikliNot = (agirlikliNot0 + agirlikliNot1 + agirlikliNot2 + agirlikliNot3 + agirlikliNot4) /
                    (matematikk + turkcek + fenk + tarihk + bedenk);

            if (tumAgirlikliNot < 44.99) {
                System.out.println("Ortalamanız: " + tumAgirlikliNot + ", Maalesef  Kaldınız !");
            } else if (tumAgirlikliNot < 59.99) {
                System.out.println("Ortalamanız: " + tumAgirlikliNot + ", Kötü !");
            } else if (tumAgirlikliNot < 69.99) {
                System.out.println("Ortalamanız: " + tumAgirlikliNot + ", Orta !");
            } else if (tumAgirlikliNot < 84.99) {
                System.out.println("Ortalamanız: " + tumAgirlikliNot + ", İyi !");
            } else if (tumAgirlikliNot <= 100) {
                System.out.println("Ortalamanız: " + tumAgirlikliNot + ", Çok iyi !");
            } else {
                System.out.println("Sistem hatası bir daha deneyin");
            }
             if (tumAgirlikliNot >= 45 || matematik < 45 || turkce < 45 || fen < 45 || tarih < 45 || beden < 45) {
                 System.out.println("Maalesef sınıfı geçmenize rağmen 45 puan altı notunuz olduğundan " +
                         "belge alamıyorsunuz");
             }

            System.out.println("İşlem tamamlandı tekrar işlem yapacak mısını? : ");
            String devamSecimi = input.next();
            devam = devamSecimi.equalsIgnoreCase("E");
        }
    }
}
