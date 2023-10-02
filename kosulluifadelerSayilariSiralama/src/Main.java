import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int s1,s2,s3,enkucuk;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz :");
        s1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        s2 = input.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz : ");
        s3 = input.nextInt();
        if(s1<s2 && s1<s3)
        {
            if(s2<s3)
            {
            System.out.println("Sıralama : " + s1+"<"+s2+"<"+s3);
            }
            else
            {
            System.out.println("Sıralama : " + s1+"<"+s3+"<"+s2);
            }
        }else if(s2<s1 && s2<s3)
        {
         if(s1<s3)
         {
             System.out.println("Sıralama : " + s2+"<"+s1+"<"+s3);
         }
         else
         {
             System.out.println("Sıralama : " + s2+"<"+s3+"<"+s1);
         }
        } else
        {
           if(s1<s2)
           {
           System.out.println("Sıralama : " + s3+"<"+s1+"<"+s2);
           }
           else
           {
           System.out.println("Sıralama : " + s3+"<"+s2+"<"+s1);
           }
        }
    }
}