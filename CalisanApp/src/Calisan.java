import java.util.Scanner;

public class Calisan {

    public String isim;
    public String soyisim;
    public long tlfNo;
    public double maas;
    public int tecrube;

    Scanner scanner = new Scanner(System.in);
    public Calisan(){

    }


    public Calisan(String isim, String soyisim,long tlfNo, double maas, int tecrube){

        this.isim = isim;
        this.soyisim = soyisim;
        this.tlfNo = tlfNo;
        this.maas = maas;
        this.tecrube = tecrube;
    }

    public void calisanBilgileriGoster(){

        System.out.println("***********Çalışan Bilgileri***********");

        System.out.println("İsim: "+isim+"\nSoyisim: "+soyisim+"\nTelefon Numarası: "+tlfNo+"\nMaaş: "+maas+"\nTecrübe: "+tecrube);
    }

    public int zamYap(int zamMiktari){
        System.out.println("Yapılan zam Miktarını giriniz: ");
        zamMiktari = scanner.nextInt();
        System.out.println(maas+" Olan  maaşınıza "+zamMiktari+" TL zam yapıldı."+
                "\nYeni Maaşınız: "+(maas+zamMiktari)+" TL dir");
        return zamMiktari;
    }

    public String formatAt(){

        System.out.println("Format atacağınız işletim sistemini giriniz: ");
        String isletimSistemi1 = scanner.nextLine();


        System.out.println(isim+", "+ isletimSistemi1+ " işletim sistemine şuan fotmat atıyor.");

        return isim+isletimSistemi1;
    }


}