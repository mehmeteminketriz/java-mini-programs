import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);
        boolean devamMi = true;
        while (devamMi) {

            System.out.print("Hangi sayının çarpım tablosunu istersiniz? : ");
            int sayi = input.nextInt();
            System.out.println("Çarpım Tablosu:");
            for (int i = 1; i < 11; i++) {
                System.out.println(sayi + "x" + i + "=" + sayi * i);
            }

            System.out.println("Programdan çıkmak için 'q' ya devam etmek için 'ENTER' e basınız: ");
            // burda önceki girdiyi temizmek lazım
            String devam = input.nextLine();

            if (devam.equals("q")){
                devamMi = false;
            }
        }*/

        Scanner input = new Scanner(System.in);
        boolean devamMi = true;

        while (devamMi) {
            System.out.print("Hangi sayının çarpım tablosunu istersiniz? : ");
            int sayi = input.nextInt();
            System.out.println("Çarpım Tablosu:");
            for (int i = 1; i < 11; i++) {
                System.out.println(sayi + "x" + i + "=" + sayi * i);
            }
            System.out.println("Programdan çıkmak için 'q' ya devam etmek için 'ENTER' e basınız: ");
            input.nextLine(); // kullanıcının girdisini temizle
            String devam = input.nextLine();
            if (devam.equals("q")) {
                devamMi = false;
            }
        }
    }
}