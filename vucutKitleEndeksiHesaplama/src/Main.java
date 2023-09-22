import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        Scanner input = new Scanner(System.in);
        double boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();
        double vki = kilo / (boy * boy) ;
        System.out.print("Vücut Kitle İndeksiniz : " + vki);
    }
}