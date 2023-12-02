// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        usHesaplama(2,4);


    }
    static void usHesaplama(int taban, int us){

        int total = 1;
        for (int i= 1;i<= us;i++){
            total = total*taban;
        }
        System.out.println("Sonuç: "+ total);
    }
}
