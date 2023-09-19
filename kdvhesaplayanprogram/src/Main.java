import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    double tutar,kdvoran;

        System.out.print("Ürün fiyatını giriniz : ");
        Scanner input = new Scanner(System.in);
        tutar = input.nextDouble();

        kdvoran = (tutar<=1000) ? 0.18 : 0.8;
        double kdv = tutar * kdvoran;
        double kdvliTutar = tutar + kdv;

        System.out.println("Kdvsiz Tutar : " + tutar);
        System.out.println("Kdv Oranı : " + kdvoran);
        System.out.println("Kdv : " + kdv);
        System.out.println("Kdv\'li fiyatı : " + kdvliTutar);


    }
}