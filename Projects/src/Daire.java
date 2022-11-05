import java.sql.SQLOutput;
import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        float pi = 3.14f;
        float yaricap;
        Scanner scan = new Scanner(System.in);
        yaricap=scan.nextFloat();

        float alan = yaricap*yaricap*pi;
        float cevre= 2*pi*yaricap;

        System.out.println("Alan : " + alan + " "+  "Cevre :" + cevre);
    }
}
