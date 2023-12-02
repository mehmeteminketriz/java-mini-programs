import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // km birim fiyatı 80 kr
        // 12 yaşından küçükse %50 indirim
        // 12 ve 24 yaş arasında ise %10 indirim
        // 65 yaşından büyükse %30 indirim
        // gidiş dönüş aalırsa %20 indirim
        // bu koşullara göre bilet fiyatı hesaplayan program

        System.out.println("******** ŞuBilet.com' a hoşgeldiniz. ********");

        String isim, soyisim, tc, numara, nereden, nereye;
        int yas, mesafe, tercih;
        int bilgi = 0;
        double ucret;

        System.out.print("İsim ?: ");
        isim = input.nextLine();
        System.out.print("Soyisim ?: ");
        soyisim = input.nextLine();
        System.out.print("T.C. Kimlik numaranız ?: ");
        tc = input.nextLine();
        System.out.print("Cep telefonu numaranız ?: ");
        numara = input.nextLine();
        System.out.print("Nereden gideceksiniz ?: ");
        nereden = input.nextLine();
        System.out.print("Nereye geleceksiniz ?: ");
        nereye = input.nextLine();
        System.out.print("Gidiş-Dönüş mü alacaksınız bileti ?: ");
        tercih = input.nextInt();

        System.out.print("Yaşınız kaç ?: ");
        yas = input.nextInt();
        System.out.print("Mesafe giriniz: ");
        mesafe = input.nextInt();

        String bilgiler= "Bilgileriniz : \n" + "İsminiz: " + isim + "\nSoyisminiz: " + soyisim + "\nT.C. Kimlik numaranız: "
                + tc + "\nTelefon numaranız: " + numara + "\nOtobüs kalkış noktası: " + nereden + "\nOtobüs varış noktası: "
                + nereye;

        ucret = mesafe * 0.80;
        if (yas<0){
            System.out.println("Yaşınız negatif olamaz!!!");
            return;
        } else if (mesafe<0) {
            System.out.println("Mesafe negatif olamaz!!!");
        }
        if (tercih == 1) {
            ucret = ucret * 50 / 100;
            if (yas < 12) {
                ucret = ucret-(ucret * 50 / 100);
                System.out.println(bilgiler);
                System.out.println("Bilgileriniz doğrumu (Doğruysa 1 Yanlışsa 2): ");
                bilgi = input.nextInt();
                if (bilgi == 1) {
                    System.out.println("Bilet ücretiniz: " + ucret+ "\tHayırlı Yolculuklar Dileriz...");
                } else {
                    System.out.println("Bilgilerinizi düzeltin !!! ");
                }
            } else if (yas < 24) {
                ucret = ucret-(ucret * 10 / 100);
                System.out.println(bilgiler);
                System.out.println("Bilgileriniz doğrumu (Doğruysa 1 Yanlışsa 2): ");
                bilgi = input.nextInt();
                if (bilgi == 1) {
                    System.out.println("Bilet ücretiniz: " + ucret+ "\tHayırlı Yolculuklar Dileriz...");
                } else {
                    System.out.println("Bilgilerinizi düzeltin !!! ");
                }
            } else if (yas > 65) {
                ucret = ucret-(ucret * 30 / 100);
                System.out.println(bilgiler);
                System.out.println("Bilgileriniz doğrumu (Doğruysa 1 Yanlışsa 2): ");
                bilgi = input.nextInt();
                if (bilgi == 1) {
                    System.out.println("Bilet ücretiniz: " + ucret+ "\tHayırlı Yolculuklar Dileriz...");
                } else {
                    System.out.println("Bilgilerinizi düzeltin !!! ");
                }
            }else {
                System.out.println(bilgiler);
                System.out.println("Bilgileriniz doğrumu (Doğruysa 1 Yanlışsa 2): ");
                bilgi = input.nextInt();
                if (bilgi == 1) {
                    System.out.println("Bilet ücretiniz: " + ucret+ "\tHayırlı Yolculuklar Dileriz...");
                } else {
                    System.out.println("Bilgilerinizi düzeltin !!! ");
                }
            }


        } else if (tercih == 2){
            if (yas < 12) {
                ucret = ucret-(ucret * 50 / 100);
                System.out.println(bilgiler);
                System.out.println("Bilgileriniz doğrumu (Doğruysa 1 Yanlışsa 2): ");
                bilgi = input.nextInt();
                if (bilgi == 1) {
                    System.out.println("Bilet ücretiniz: " + ucret+ "\tHayırlı Yolculuklar Dileriz...");
                } else {
                    System.out.println("Bilgilerinizi düzeltin !!! ");
                }
            } else if (yas < 24) {
                ucret = ucret-(ucret * 10 / 100);
                System.out.println(bilgiler);
                System.out.println("Bilgileriniz doğrumu (Doğruysa 1 Yanlışsa 2): ");
                bilgi = input.nextInt();
                if (bilgi == 1) {
                    System.out.println("Bilet ücretiniz: " + ucret+ "\tHayırlı Yolculuklar Dileriz...");
                } else {
                    System.out.println("Bilgilerinizi düzeltin !!! ");
                }
            } else if (yas > 65) {
                ucret = ucret-(ucret * 30 / 100);
                System.out.println(bilgiler);
                System.out.println("Bilgileriniz doğrumu (Doğruysa 1 Yanlışsa 2): ");
                bilgi = input.nextInt();
                if (bilgi == 1) {
                    System.out.println("Bilet ücretiniz: " + ucret+ "\tHayırlı Yolculuklar Dileriz...");
                } else {
                    System.out.println("Bilgilerinizi düzeltin !!! ");
                }
            } else {
                System.out.println(bilgiler);
                bilgi = input.nextInt();
                if (bilgi == 1) {
                    System.out.println("Bilet ücretiniz: " + ucret+ "\tHayırlı Yolculuklar Dileriz...");
                } else {
                    System.out.println("Bilgilerinizi düzeltin !!! ");
                }
            }
        }
        else {
            System.out.println("Geçerli bir değer giriniz");
        }

    }
}