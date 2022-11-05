import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        float km;
        Scanner scan = new Scanner(System.in);
        System.out.println("KM girin :");
        km=scan.nextFloat();

        float acilis=10;
        float toplam = (km * 2.2f) + 10 ;

        float hesap = toplam < 20 ? 20 : toplam;

        System.out.println("Odenecek :" + hesap + "TL");




    }
}
