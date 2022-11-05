import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        float a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kenarlari Girin :");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();

        float cevre = a + b + c;

        float u = (a+b+c)/2;

        double alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));

        System.out.println("Alan :" + alan);


    }
}
