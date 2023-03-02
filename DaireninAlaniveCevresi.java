import java.util.Scanner;
public class DaireninAlaniveCevresi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        double r;
        System.out.println("YarıCapi Giriniz : ");
        r = input.nextDouble();

        double cevre = 2*pi*r;
        double alan = pi*r*r;

        System.out.println(cevre);
        System.out.println(alan);





    }
}
