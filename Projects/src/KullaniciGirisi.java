import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        int sifre;
        int olan=1234;
        int j;
        Scanner scan= new Scanner(System.in);
        System.out.print("Şifrenizi Girin :");
        sifre=scan.nextInt();
        if(sifre==olan){
            System.out.print("Giriş yaptınız");
        }
        else {
            System.out.print("Şifreyi sıfırlamak için 1e basın :");
            int i=scan.nextInt();
            if(i==1){
                System.out.print("Yeni Sifrenizi Giriniz :");
                j=scan.nextInt();

                if(j==olan){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.:");
                    j=scan.nextInt();
                    if(j!=olan){
                        System.out.println("Şifre oluşturuldu");
                    }

            }
                else {
                    System.out.println("Şifre oluşturuldu");
                }
        }


    }
}}
