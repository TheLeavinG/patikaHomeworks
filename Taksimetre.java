import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

double GidilenKM, Hesap, c, d, e;
double BaslangicUcreti = 10;

System.out.println("Gittiginiz Mesafeyi KM Cinsinden Giriniz : ");
GidilenKM = input.nextDouble();


Hesap = BaslangicUcreti + (GidilenKM*2.20);

if (Hesap <= 20) {

    System.out.println("Taksimtere Ucreti : 20 TL ");

}

else if  (Hesap > 20) {

    System.out.println("Taksimetre Ucreti : " + Hesap + "TL");


}






    }



}
