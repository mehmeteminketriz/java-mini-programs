// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3,4,5,6};
        int aranacak = 0;
        boolean varMi= false;

        for (int number:numbers) {
            if (number == aranacak) {
                varMi = true;
            }
        }
        if (varMi){
            System.out.println("Sayı mevcut");
        }else {
            System.out.println("Sayı mevcıt değil");
        }
        }
    }