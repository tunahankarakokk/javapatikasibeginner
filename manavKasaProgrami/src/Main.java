import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     double armutFiyat = 2.14,elmaFiyat = 3.67,
     domatesFiyat = 1.11,muzFiyat=0.95,patlicanFiyat=5.00;
        System.out.print("Armut Kaç Kilo ? : ");
        Scanner input = new Scanner(System.in);
        int armutKilo = input.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        int elmaKilo = input.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        int domatesKilo = input.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        int muzKilo = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        int patlicanKilo = input.nextInt();
        double total = (armutKilo * armutFiyat)+(elmaKilo * elmaFiyat)+
        (domatesKilo * domatesFiyat) + (muzKilo * muzFiyat) +
        (patlicanKilo * patlicanFiyat);
        System.out.print("Toplam Tutar : " + total + " Tl");

    }
}