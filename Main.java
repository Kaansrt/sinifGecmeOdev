import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matNot, fizNot, trNot, kmyaNot, muzikNot;
        int gecmeNot = 55;
        int ders = 0;
        System.out.print("Matematik notunuzu giriniz : ");
        matNot = input.nextInt();
        if (matNot < 0 || matNot > 100) {
            matNot = 0;
        } else {
            ders+=1;
        }
        System.out.print("Fizik notunuzu giriniz : ");
        fizNot = input.nextInt();
        if (fizNot < 0 || fizNot > 100) {
            fizNot = 0;
        } else {
            ders += 1;
        }
        System.out.print("Türkçe notunuzu giriniz : ");
        trNot = input.nextInt();
        if (trNot < 0 || trNot > 100) {
            trNot = 0;
        } else {
            ders+=1;
        }
        System.out.print("Kimya notunuzu giriniz : ");
        kmyaNot = input.nextInt();
        if (kmyaNot < 0 || kmyaNot > 100) {
            kmyaNot = 0;
        } else {
            ders=1;
        }
        System.out.print("Müzik notunuzu giriniz : ");
        muzikNot = input.nextInt();
        if (muzikNot < 0 || muzikNot > 100) {
            muzikNot = 0;
        } else {
            ders+=1;
        }
        double ort = (matNot + fizNot + trNot + kmyaNot + muzikNot) / ders;
        System.out.println("Geçerli ders sayısı : "+ ders);
        System.out.println("Ortalamanız : "+ ort);
        if (ort >= gecmeNot && ort <=100) {
            System.out.println("Geçtiniz.");
        } else if (ort < gecmeNot && ort > 0) {
            System.out.println("Üzgünüz kaldınız.");
        } else {
            System.out.println("Ortalamanız 0 ile 100 arasında değildir.");
        }

    }
}