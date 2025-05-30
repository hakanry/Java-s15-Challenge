import model.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = Library.getInstance();













        System.out.println("Kütüphane Otomasyonuna Hoşgeldiniz.");

        Scanner scanner = new Scanner(System.in);

        int secilenIslem;

        do{
            System.out.println("    Yapmak istediğiniz işlemi seçiniz...");
            System.out.println("        1-KİTAP EKLEME");
            System.out.println("        2-KİTAP SEÇME");
            System.out.println("        3-KİTAP GÜNCELLEME");
            System.out.println("        4-KİTAP SİLME");
            System.out.println("        5-KATEGORİYE GÖRE KİTAPLARI LİSTELEME");
            System.out.println("        6-YAZARA GÖRE KİTAPLARI LİSTELEME");
            System.out.println("        7-KİTAP ÖDÜNÇ ALMA");
            System.out.println("        8-KİTAP TESLİM ETME");
            System.out.println("        0-OTOMASYONDAN ÇIKIŞ");
            secilenIslem = scanner.nextInt();

        }while (secilenIslem != 0);



    }
}