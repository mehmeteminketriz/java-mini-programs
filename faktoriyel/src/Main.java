import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java Girilen Sayının Faktöriyelini Hesaplayan Program

        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayının faktoriyelini bulmak istersiniz?: ");


        int sayi = input.nextInt();

        long faktoriyel = 1;

        while (sayi>1){
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println(faktoriyel);
    }
}