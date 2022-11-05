import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,fiz,kim,tur,tar,muz;
        Scanner scan = new Scanner(System.in);
        System.out.print("Matematik :");
        mat=scan.nextInt();
        System.out.print("Fizik :");
        fiz=scan.nextInt();
        System.out.print("Kimya :");
        kim=scan.nextInt();
        System.out.print("Turkce :");
        tur=scan.nextInt();
        System.out.print("Tarih :");
        tar=scan.nextInt();
        System.out.print("Muzik :");
        muz=scan.nextInt();

        float ortalama = (mat+fiz+kim+tur+tar+muz)/6;

        System.out.println("Ortalamaniz :" + ortalama);

        boolean gecti = (ortalama>60);

        String str = gecti ? "Sınıfı geçti" :  "Sınıfta kaldı";
        System.out.println(str);







    }
}
