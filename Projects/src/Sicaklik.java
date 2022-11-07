import java.util.Scanner;

public class Sicaklik {
    public static void main(String[] args) {

        int heat;
        Scanner scanner =new Scanner(System.in);
        System.out.print( " Sicaklik Derecesi Giriniz :");
        heat=scanner.nextInt();

        if (heat <= 5) { System.out.println( "Kayak yapabilirsin"); }
        else if ( heat>5 && heat<=15) {System.out.println(" Sinemaya gidebilirsin"); }
        else if ( heat>=15 && heat<=25) { System.out.println( " Piknik gidebilirsin");}
        else if ( heat>=25) { System.out.println( " Yuzmeye gidebilirsin");}

    }

}