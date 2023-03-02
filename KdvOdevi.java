import java.util.Scanner;


public class KdvOdevi {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fiyat;



        System.out.println("Aldiginiz Urunun Fiyatini Giriniz : ");
        fiyat = input.nextDouble();


        double kdv18 = fiyat * 18/100;
        double kdv8 = fiyat * 8/100;

        if (fiyat < 1000) {

            System.out.println(kdv18);


        }

        else if (fiyat >= 1000) {

            System.out.println(kdv8);
        }







    }




}

