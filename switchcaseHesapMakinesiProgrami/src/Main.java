import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("2.Sayıyı giriniz : ");
        n2 = input.nextInt();
        System.out.println("1-Toplama :\n2-Çıkarma :\n3-Çarpma :\n4-Bölme :");
        System.out.print("Seçiminiz :");
        select = input.nextInt();
        switch (select){
            case 1 :
                System.out.println(n1 + " + " + n2 + "= "+(n1+n2));
                break;
            case 2 :
                System.out.println(n1 + " - " + n2 + "= "+(n1-n2));
                break;
            case 3 :
                System.out.println(n1 + " x " + n2 + "= "+(n1*n2));
                break;
            case 4 :
                System.out.println(n2!=0 ? n1 +" / "+ n2 + "=" + (n1 / n2)
                        : "bölen sayı 0 olamaz!");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
                break;

        }
    }
}