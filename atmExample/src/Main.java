import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Emin IBAN = TR82 6382 6382 6382 6382 6382 82
        Enes IBAN = TR63 6321 6321 6321 6321 6321 63

        Emin kart numarası = 1234 5678 9012 3456
        Emin Şifre = 8961

        Enes kart numarası = 9876 5432 1098 7654
        Enes Şifre = 9917

        bakiye sorgulama -->1
        para çekme -->2
        para yatırma -->3
        başka hesaba para aktarma -->4
         */
        Scanner input = new Scanner(System.in);
        double emin_bakiye = 500;
        double enes_bakiye = 0;
        String islemler = "yapmak istediğiniz işlemi girin: " +
                "\nbakiye sorgulama -->1" +
                "\npara çekme -->2" +
                "\npara yatırma -->3" +
                "\nbaşka hesaba para aktarma -->4";


        System.out.println("----------<KetrizBank ATM ekranına HOŞGELDİNİZ !!!>----------");

        System.out.print("Kart numaranızı giriniz: ");
        String kart_no = input.nextLine();
        System.out.print("Kart şifrenizi giriniz: ");
        String kart_sifre = input.nextLine();

        if (kart_no.equals("1234567890123456")&& kart_sifre.equals("8961")){

            System.out.println("Hoşgeldiniz MEHMET EMİN KETRİZ !!!");
            System.out.println(islemler);
            String islem = input.nextLine();
            switch (islem){
                case "1":
                    System.out.println(emin_bakiye);
                    break;
                case "2":
                    System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                    double para_cekme = input.nextDouble();
                    if (para_cekme <= emin_bakiye){
                        System.out.println("İşlem sürüyor...");
                        emin_bakiye -= para_cekme;
                        System.out.println("Önce kartınız sonra paranızı alınız!!!");
                    }else {
                        System.out.println("Bakiye yetersiz");
                    }
                    break;
                case "3":
                    System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                    double para_yatırma = input.nextDouble();
                    System.out.println("İşlem sürüyor...");
                    emin_bakiye += para_yatırma;
                    System.out.println("Kalan bakiye: "+emin_bakiye);
                    System.out.println("Kartınızı alınız!!!");
                    break;
                case "4":
                    System.out.print("Parayı yatırcağınız IBAN adresini giriniz: ");
                    String iban_adresi = input.nextLine();
                    if (iban_adresi.length()==26 && iban_adresi.equals("TR636321632163216321632163")){
                        System.out.print("Yatırılacak tutarı giriniz: ");
                        double ibana_aktarme = input.nextDouble(); // küsüratı virgül kullanarak belirt
                        emin_bakiye -= ibana_aktarme;
                        enes_bakiye += ibana_aktarme;
                        System.out.println("Kalan bakiye: "+emin_bakiye);
                        System.out.println("Enes bakiye: "+enes_bakiye);
                    }else {
                        System.out.println("Hatalı IBAN grildi");
                    }
                    break;
                default:
                    System.out.println("Hatalı bir giriş yaptınız lütfen 1-2-3-4 gibi değerler girin.");
            }


        }else if (kart_no.equals("9876543210987654") && kart_sifre.equals("9917")){
            System.out.println("Hoşgeldiniz Enes KETRİZ !!!");
            System.out.println(islemler);
            String islem = input.nextLine();
            switch (islem){
                case "1":
                    System.out.println(enes_bakiye);
                    break;
                case "2":
                    System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                    double para_cekme = input.nextDouble();
                    if (para_cekme <= enes_bakiye){
                        System.out.println("İşlem sürüyor...");
                        enes_bakiye -= para_cekme;
                        System.out.println("Önce kartınız sonra paranızı alınız!!!");
                    }else {
                        System.out.println("Bakiye yetersiz");
                    }
                    break;
                case "3":
                    System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                    double para_yatırma = input.nextDouble();
                    System.out.println("İşlem sürüyor...");
                    enes_bakiye += para_yatırma;
                    System.out.println("Kalan bakiye: "+enes_bakiye);
                    System.out.println("Kartınızı alınız!!!");
                    break;
                case "4":
                    System.out.print("Parayı yatırcağınız IBAN adresini giriniz: ");
                    String iban_adresi = input.nextLine();
                    if (iban_adresi.length()==26 && iban_adresi.equals("TR826382638263826382638282")){
                        System.out.print("Yatırılacak tutarı giriniz: ");
                        double ibana_aktarme = input.nextDouble(); // küsüratı virgül kullanarak belirt
                        enes_bakiye -= ibana_aktarme;
                        emin_bakiye += ibana_aktarme;
                        System.out.println("Kalan bakiye: "+enes_bakiye);
                        System.out.println("Enes bakiye: "+emin_bakiye);
                    }else {
                        System.out.println("Hatalı IBAN grildi");
                    }
                    break;
                default:
                    System.out.println("Hatalı bir giriş yaptınız lütfen 1-2-3-4 gibi değerler girin.");
            }


        }else {
            System.out.println("Kullanıcı adı veya şifre hatalı !!");
        }
    }
}