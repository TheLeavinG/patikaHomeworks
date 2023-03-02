import java.util.Scanner;

public class DikUcgen {

    public static void main(String[] args) {

        double  a, b, c, u, Alan;

         Scanner input = new Scanner(System.in);

         System.out.println("1. Kenari Giriniz : ");
         a = input.nextDouble();

         System.out.println("2. Kenari Giriniz : ");
         b = input.nextDouble();

         c = Math.sqrt((a*a)+(b*b));


         u = (a+b+c)/2;

         Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));


         System.out.println(Alan);












    }




}
