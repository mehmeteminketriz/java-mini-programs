import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float turkish, maths, music, art;
        String istek;
        System.out.print("Matematik notunu gir: ");
        maths = input.nextInt();

        System.out.print("Türkeçe notunu gir: ");
        turkish = input.nextInt();

        System.out.print("Müzik notunu gir: ");
        music = input.nextInt();

        System.out.print("Resim notunu gir: ");
        art = input.nextInt();

        double avarege = (maths + turkish + music + art) / 4;

        System.out.println("Ağırlıksız not ortalamsı : " + avarege);

        System.out.println("Ağırlıklı not ortalaması hesaplamak istermisin ? \nEvet: e, Hayır: h");
        istek = input.next();

        float mathsk = maths * 10;
        float turkishk = turkish * 11;
        float musick = music * 2;
        float artk = art * 2;
        float avaragek = (mathsk + turkishk + musick + artk) / 25;
        if(istek.contains("h")){
            System.out.println("Program bitti.");
        } else {
            System.out.println("Ağırlıklı not ortalama : " + avaragek);
        }


    }
}
