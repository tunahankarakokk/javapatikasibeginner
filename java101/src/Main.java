import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    //değişkenleri oluştur
    int mat,fizik,kimya,turkce,tarih,muzik;
    //Scanner sınıfımızı tanımladık
    Scanner inp = new Scanner(System.in);
    //kullanıcıdan değerleri al
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();
        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();
        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6 ;
        System.out.println("Ortalamanız : " + sonuc);
        String durum = (sonuc>60) ? "Geçti":"Kaldı";
        System.out.println("Sınıf Geçme Durumunuz : " + durum);


    }
}
