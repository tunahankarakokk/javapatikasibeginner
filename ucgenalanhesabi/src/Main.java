import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int a,b,c;
    double alan;
    Scanner girdi = new Scanner(System.in);

        System.out.print("a kenarını giriniz : ");
        a = girdi.nextInt();
        System.out.print("b kenarını giriniz : ");
        b = girdi.nextInt();
        System.out.print("c kenarını giriniz : ");
        c = girdi.nextInt();

        double u = (a + b + c) / 2 ;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u - c));

        System.out.println("Üçgenin alanı : " + alan);

    }
}