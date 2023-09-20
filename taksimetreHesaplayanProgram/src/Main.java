import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int km;
       double perKm = 2.20,total = 10,startPrice=10;
       System.out.print("Gidilen mesafeyi giriniz : ");
       Scanner input = new Scanner(System.in);
       km = input.nextInt();
       total = km * perKm;
       total += startPrice;
       total =(total < 20) ? 20 : total;
       System.out.println("Toplam Tutar : " + total);
    }
}