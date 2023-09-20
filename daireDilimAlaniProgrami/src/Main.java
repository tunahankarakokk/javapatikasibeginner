import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
   int yaricap,aciolcusu;
   double pi = 3.14;
        System.out.print("Dairenin yarıçapını giriniz : ");
        Scanner input = new Scanner(System.in);
        yaricap = input.nextInt();
        System.out.print("Açı ölçüsünü giriniz : ");
        aciolcusu = input.nextInt();
   double dilimAlan = (pi *(yaricap * yaricap) * aciolcusu) / 360 ;
        System.out.print("Dairenin dilim alanı : " + dilimAlan);

    }
}