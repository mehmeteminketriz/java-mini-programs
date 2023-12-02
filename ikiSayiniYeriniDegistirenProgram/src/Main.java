import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // sayı tekmi çiftmi

        Scanner input = new Scanner(System.in);

        while (true) {
            boolean devamMi = true;
            System.out.print("__________________<Programdan çıkmak için 'q' ya basınız.>__________________\nSayı giriniz: ");
            String sSayi = input.nextLine();


            if (sSayi.equals("q")) {
                devamMi = false;
                break;
            } else {
                int sayi = Integer.parseInt(sSayi);
                if (sayi % 2 == 0) {
                    System.out.println("_________\nSayı çift.");
                } else {
                    System.out.println("_________\nSayı çift değil.");
                }
            }
        }

    }
}