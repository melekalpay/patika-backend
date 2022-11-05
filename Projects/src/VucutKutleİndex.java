import java.util.Scanner;

public class VucutKutleİndex {
    public static void main(String[] args) {
        double boy,kilo,index;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy=scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo=scan.nextFloat();
        System.out.println("Vücut kitle indexiniz :" + kilo/(boy*boy));


    }
}
