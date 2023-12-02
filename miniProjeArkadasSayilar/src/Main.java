public class Main {
    public static void main(String[] args) {
        // 220 284 en küçük iki arkadaş sayılar. 1 den başlayıp 220 ye kadar 220 yi bölen sayıların toplamı = 284
        // 1 den başlayıp 284 ye kadar 284 ü bölen sayıların toplamı = 220

        int number1 = 222;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 = total1 + i;
            }
        }
        for (int j = 1; j < number2; j++) {
            if (number2 % j == 0) {
                total2 = total2 + j;
            }
        }
        if (total1 == number2 && total2 == number1) { // && and operatörü iki koşunda sağlaması lazım || or operatörü biri bile sağlarsa olur
            System.out.println("Arkadaş sayılar");
        } else {
            System.out.println("Arkadaş sayılar değil");
        }
    }
/*        if (total1==number2){                          // 2. yol da bu ama üstteki daha temiz
            if (total2== number1){
                System.out.println("Arkadaş sayılar");
            }else {
                System.out.println("Arkadaş sayılar değil");
            }
        }*/

}