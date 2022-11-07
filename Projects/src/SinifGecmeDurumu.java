import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fiz,tur,kim,muz;
        double average;
        Scanner scan=new Scanner(System.in);
        System.out.println("Mat Notu :");
        mat=scan.nextInt();
        System.out.println("Fizik Notu :");
        fiz=scan.nextInt();
        System.out.println("Turkce Notu :");
        tur=scan.nextInt();
        System.out.println("Kimya Notu :");
        kim=scan.nextInt();
        System.out.println("Muzik Notu :");
        muz=scan.nextInt();

        average = (mat+tur+fiz+kim+muz)/5;


        if(mat < 0 || mat > 100){
            average= (fiz+tur+kim+muz)/4;
        } else if (fiz < 0 || fiz > 100) {
            average = (mat + tur + kim + muz) / 4;
        }else if (tur < 0 || tur > 100) {
            average= (mat+fiz+kim+muz)/4;
        } else if (kim < 0 || kim > 100) {
            average= (mat+tur+fiz+muz)/4;
        }else if (muz < 0 || muz > 100) {
            average= (mat+tur+kim+fiz)/4;
        }

        if(average > 55){
            System.out.println("Geçtiniz.");
        }
        else System.out.println("Kaldınız.");

    }
}
