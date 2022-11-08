import java.util.Scanner;

public class ArtikYilHesabi {
    public static void main(String[] args) {
        int yil,kalan;
        Scanner scan= new Scanner(System.in);
        System.out.print("Yıl Giriniz :");
        yil=scan.nextInt();

        kalan=yil%100;
        if(kalan%4==0 || kalan==0){
            System.out.println(yil + " Bir Artik Sayidir.");
        }
        else System.out.println(yil +"Artik Sayi Değildir.");



    }
}
