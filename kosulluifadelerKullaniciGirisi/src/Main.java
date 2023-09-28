import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    String userName,password,newPass,s1;

    Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }else{
            System.out.println("Bilgileriniz yanlış!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz ? \n E - Evet H - Hayır :");
            s1 =inp.nextLine();
            if (s1.equals("E")){
                System.out.print("Yeni şifrenizi giriniz : ");
                newPass = inp.nextLine();
                if(newPass.equals("java123")){
                    System.out.println("Şifre oluşturulamadı!Lütfen başka şifre giriniz!");
                }

            }
        }
    }
}