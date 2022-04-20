import java.util.Scanner;

/**
 * @author ANIL CAN ÖZDEMİR
 * Taksimetre Programı
 * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
 *
 * Taksimetre KM başına 2.20 TL tutmaktadır.
 * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
 * Taksimetre açılış ücreti 10 TL'dir.
 */
public class TaksimetreProgrami {
    public static void main(String[] args) {
        System.out.println("Kac km gidildi?:");
        Scanner input = new Scanner(System.in);
        int gidilenKm  =input.nextInt();
        double  min=20,fiyat=10,fiyatArtisi=2.2;

        fiyat+=gidilenKm*fiyatArtisi;
        fiyat=(fiyat>20)?fiyat:20;

        System.out.println("FIYAT :"+fiyat);


    }
}
