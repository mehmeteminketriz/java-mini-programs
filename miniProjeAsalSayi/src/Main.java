// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number = 1;
        boolean isPrime = true;
        if (number==1){
            System.out.println("Sayı= "+ number+ ", ve asal değil.");
            return;
        }

        if (number<1){
            System.out.println("Geçersiz değer girildi");
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("Sayı= "+ number+ ", ve asal.");
        }else{
            System.out.println("Sayı= "+ number+ ", ve asal değil.");
        }
    }
}
