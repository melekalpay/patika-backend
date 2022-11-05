import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2,secim;

        Scanner sc=new Scanner(System.in);
        System.out.print("İlk Sayıyı Girin :");
        sayi1=sc.nextInt();

        System.out.print("İkinci Sayıyı Girin :");
        sayi2=sc.nextInt();

        System.out.println("1-Toplama 2-Cikarma 3-Carpma 4-Bolme");
        secim=sc.nextInt();

        switch (secim){
            case 1 :
                System.out.println("Toplam :" + (sayi1+sayi2));break;
            case 2 :
                System.out.println("Cikarma :" + (sayi1-sayi2));break;
            case 3 :
                System.out.println("Carpim :" + (sayi1*sayi2));break;
            case 4 :
                System.out.println("Bolum :" + (sayi1/sayi2));break;
            default:
                System.out.println("Geçerli bir işlem girin.");
        }
    }
}
