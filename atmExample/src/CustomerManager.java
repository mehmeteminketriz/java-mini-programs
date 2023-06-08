import java.util.Scanner;

public class CustomerManager {
    public boolean go() {
        Scanner input = new Scanner(System.in);
        System.out.print("Progrmdan çıkmak için 'q' ya devam etmek için 'f' ye basın: ");
        String devam = input.nextLine();
        if (devam.equals("q")) {
            return false;
        } else if (devam.equals("f")) {
            return true;
        } else {
            System.out.println("Geçersiz harf girildi, tekrar deneyin.");
            return false;
        }
    }
}
