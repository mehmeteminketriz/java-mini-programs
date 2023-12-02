public class Main {
    public static void main(String[] args) {
        // mükemmel sayı kendinden başka pozitif tüm tam bölenlerin sayısı kendisine eşit olan sayıya denir.
        // 6 mükemmel sayıdır 1 2 3 e bölünür 1+2+3 = 6

        int number = 0;
        boolean sayi = true;
        int total = 0;
        if (number == 0){
            System.out.println("0 değeri girilemez");
            return;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("Mükemmel Sayı");
        } else {
            System.out.println("Mükemmel Sayı Değil");
        }
    }
}

