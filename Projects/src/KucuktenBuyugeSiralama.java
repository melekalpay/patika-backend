
import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {

        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.print( " 1. sayi : ");
        a= input.nextInt();
        System.out.print( " 2. sayi : ");
        b= input.nextInt();
        System.out.print( " 3. sayi :  ");
        c= input.nextInt();

        if ((a<b && a<c)){
            if (b<c){
                System.out.println("Küçükten büyüğe sırayla: " + a + ", " + b + ", " + c + "." );
            }else{
                System.out.println("Küçükten büyüğe sırayla: " + a + ", " + c + ", " + b + "." ) ;
            }
        }else if ((b<a && b<c)){
            if (a<c){
                System.out.println("Küçükten büyüğe sırayla: " + b + ", " + a + ", " + c + "." );
            }else{
                System.out.println("Küçükten büyüğe sırayla: " + b + ", " + c + ", " + a + ".");
            }
        }else{
            if (a<b){
                System.out.println("Küçükten büyüğe sırayla: " + c + ", " + a + ", " + b + ".");
            }else{
                System.out.println("Küçükten büyüğe sırayla: " + c + ", " + b + ", " + a + ".");
            }
        }
    }
}