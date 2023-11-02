package java101;
import java.util.Scanner;
public class basamakToplami {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        scanner.close();

        int toplam = 0;

        // Sayının basamaklarını toplamak için bir döngü kullanın
        while (sayi > 0) {
            int basamak = sayi % 10; // Sayının birler basamağını al
            toplam += basamak; // Basamağı toplama ekle
            sayi /= 10; // Birler basamağını sayıdan çıkar
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}

