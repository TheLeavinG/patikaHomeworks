import java.util.Scanner;

public class IlkOdev {

    public static void main(String[] args) {
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        Matematik = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz : ");
        Fizik = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : ");
        Kimya = input.nextInt();

        System.out.println("Turkce Notunuzu Giriniz : ");
        Turkce = input.nextInt();

        System.out.println("Tarih Notunuzu Giriniz : ");
        Tarih = input.nextInt();

        System.out.println("Muzik Notunuzu Giriniz : ");
        Muzik = input.nextInt();

        double Ortalama = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik) / 6;


        if (Ortalama < 60.0) {

            System.out.println("Sinifta Kaldiniz");
        } else if (Ortalama >= 60.0) {

            System.out.println("Sinifi Gectiniz");
        }


    }

}