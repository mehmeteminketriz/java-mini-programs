import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean devam = true;


        while (devam) {
            float number1, number2;
            System.out.println("Hesap Makinesi");
            System.out.print("1. sayıyı giriniz: ");
            number1 = input.nextFloat();
            System.out.print("2. sayıyı giriniz: ");
            number2 = input.nextFloat();
            System.out.println("Ne yapmak istersiniz: \nToplama: t\nÇıkarma: ç\nÇarpma: x\nBölme: b");
            String islem = input.next();

            if (islem.contains("t")) {
                System.out.println("toplam: " + (number1 + number2));
            } else if (islem.contains("ç")) {
                System.out.println("Fark: " + (number1 - number2));
            } else if (islem.contains("x")) {
                System.out.println("Çarpım: " + (number1 * number2));
            } else {
                System.out.println("Bölüm: " + (number1 / number2));
            }
            System.out.print("Devam etmek istiyor musunuz? (E/H): ");
            String devamSecim = input.next();
            devam = devamSecim.equalsIgnoreCase("E");
        }


    }


}
