import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static float vki;

    public static void main(String[] args) {


        System.out.println("_--_--_--_--_VKE Hesaplam Programına Hoşgeldiniz_--_--_--_--_\n");

        vki = vkiHesaplama();

        sonuc();

        System.out.println("vke = "+vki);

    }

    public static float vkiHesaplama(){
        float boy, kilo,boy1;


        System.out.print("Boyunuzu m cinsinden giriniz: ");
        boy1= scanner.nextFloat();

        boy = boy1/100; // cm cinsinden girilen değeri m ye çevirdik.

        System.out.print("Kilonuzu  giriniz: ");
        kilo=scanner.nextFloat();

        vki = kilo/(boy*boy);


        return vki;
    } // vki  hesaplıyorum bu metodla

    public static void sonuc(){
        if (vki<18.5){
            System.out.println("Zayıf\n" +
                    "Uzunluğunuza göre uygun ağırlıkta olmadığınızı, zayıf olduğunuzu gösterir.\n" +
                    "Zayıflık, bazı hastalıklar için risk oluşturan ve istenmeyen bir durumdur.\n" +
                    "Boyunuza uygun ağırlığa erişmeniz için yeterli ve dengeli beslenmeli, beslenme alışkanlıklarınızı geliştirmeye özen göstermelisiniz.");
        }else if (vki>=18.5 && vki<24.9){
            System.out.println("Normal\n" +
                    "Uzunluğunuza göre uygun ağırlıkta olduğunuzu gösterir.\n" +
                    "Yeterli ve dengeli beslenerek ve düzenli fiziksel aktivite yaparak bu ağırlığınızı korumaya özen gösteriniz.");
        } else if (vki>=25 && vki<29.9) {
            System.out.println("Fazla Kilolu\n" +
                    "Boyunuza göre vücut ağırlığınızın fazla olduğunu gösterir.\n" +
                    "Fazla kilolu olma durumu gerekli önlemler alınmadığı takdirde pek çok hastalık için risk faktörü olan obeziteye (şişmanlık) yol açar.");
        } else if (vki>=30 && vki<34.9) {
            System.out.println("Şişman (Obez) - I. Sınıf\n" +
                    "Boyunuza göre vücut ağırlığınızın fazla olduğunu bir başka deyişle şişman olduğunuzun bir göstergesidir.\n" +
                    "Şişmanlık, kalp-damar hastalıkları, diyabet, hipertansiyon v.b. kronik hastalıklar için risk faktörüdür.\n" +
                    "Bir sağlık kuruluşuna başvurarak hekim / diyetisyen kontrolünde zayıflayarak normal ağırlığa inmeniz sağlığınız açısından çok önemlidir.\n" +
                    "Lütfen, sağlık kuruluşuna başvurunuz.");
        }else if (vki>=35 && vki<45){
            System.out.println("Şişman (Obez) - II. Sınıf\n" +
                    "Uzunluğunuza göre vücut ağırlığınızın fazla olduğunu bir başka deyişle şişman olduğunuzun bir göstergesidir.\n" +
                    "Şişmanlık, kalp-damar hastalıkları, diyabet, hipertansiyon v.b. kronik hastalıklar için risk faktörüdür.\n" +
                    "Bir sağlık kuruluşuna başvurarak hekim / diyetisyen kontrolünde zayıflayarak normal ağırlığa inmeniz sağlığınız açısından çok önemlidir.\n" +
                    "Lütfen, sağlık kuruluşuna başvurunuz.");
        }else {
            System.out.println("Aşırı Şişman (Aşırı Obez) - III. Sınıf\n" +
                    "Boyunuza göre vücut ağırlığınızın fazla olduğunu bir başka deyişle şişman olduğunuzun bir göstergesidir.\n" +
                    "Şişmanlık, kalp-damar hastalıkları, diyabet, hipertansiyon v.b. kronik hastalıklar için risk faktörüdür.\n" +
                    "Bir sağlık kuruluşuna başvurarak hekim / diyetisyen kontrolünde zayıflayarak normal ağırlığa inmeniz sağlığınız açısından çok önemlidir.\n" +
                    "Lütfen, sağlık kuruluşuna başvurunuz.");
        }

    } // bu metod gelen vki  verisine göre zayıflık şişmanlık değerleri yazıdırıyor
}