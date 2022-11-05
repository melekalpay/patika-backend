import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        float sayi;
        Scanner scan=new Scanner(System.in);
        System.out.print("Para Tutarını Girin :");
        sayi= scan.nextInt();

        float kdvli= (sayi>0 && sayi <1000) ? ((sayi*18)/100)+sayi : ((sayi*8)/100)+sayi;
        System.out.println("KDV'li fiyatı :" + kdvli);
        System.out.println("KDV tutarı :" + (kdvli-sayi));







    }
}
