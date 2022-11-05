import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        float a,e,d,m,p,toplam;
        Scanner scan= new Scanner(System.in);
        System.out.print("Armut Kaç Kilo :");
        a=scan.nextFloat();
        System.out.print("Elma Kaç Kilo :");
        e=scan.nextFloat();
        System.out.print("Domates Kaç Kilo :");
        d=scan.nextFloat();
        System.out.print("Muz Kaç Kilo :");
        m=scan.nextFloat();
        System.out.print("Patlican Kaç Kilo :");
        p=scan.nextFloat();

        toplam = a*2.14f+e*3.67f+d*1.11f+m*0.95f+p*5;

        System.out.print("Toplam Tutar :");

        System.out.printf("%.2f", toplam);
    }
}
