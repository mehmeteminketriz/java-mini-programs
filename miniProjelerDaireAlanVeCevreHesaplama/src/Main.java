import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını girniz: ");
        float yaricap = input.nextFloat();
        double pi;
        double alan, cevre;
        pi = 3.14159265359;
        alan = pi*(yaricap*yaricap);
        cevre = 2*pi*yaricap;
        System.out.println("Dairenin alanı: "+ alan);
        System.out.println("Dairenin çevresi: "+ cevre);
        }
    }