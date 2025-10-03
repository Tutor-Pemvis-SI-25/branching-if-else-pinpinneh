import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, bilganjil, bilgenap, perkalian, terbesar, penjumlahan, jenis, total1, total2, sama;

        System.out.println("Bilangan pertama:");
        bil1 = Integer.parseInt(input.nextLine());
        System.out.println("Bilangan kedua:");
        bil2 = Integer.parseInt(input.nextLine());
        total1 = bil1 % 2;
        total2 = bil2 % 2;
        if (total1 == 1) {
            System.out.println("bilangan pertama ganjil ");
        } else {
            System.out.println("bilangan pertama genap ");
        }
        if (total2 == 1) {
            System.out.println("bilangan kedua ganjil ");
        } else {
            System.out.println("bilangan kedua genap ");
        }
        if (bil1 > bil2) {
            terbesar = bil1;
            System.out.println("Bilangan kedua lebih besar" + terbesar);
        } else {
            terbesar = bil2;
            System.out.println("Bilangan kedua lebih besar" + terbesar);
        }
        if (bil1 == bil2) {
            sama = bil1;
            System.out.println("Kedua bilangan sama besar");
        } else {
            sama = bil2;
            System.out.println("Kedua bilangan sama besar");
        }
        if (total1 == 0 && total2 == 0) {
            penjumlahan = bil1 + bil2;
            System.out.println("hasil penjumlahan: " + penjumlahan);
        }
        if (total1 == 1 && total2 == 1) {
            perkalian = bil1 * bil2;
            System.out.println("hasil perkalian: " + perkalian);
        }
        if (total1 == 0 && total2 == 0) {
            penjumlahan = bil1 + bil2;
            System.out.println("hasil penjumlahan: " + penjumlahan);
        }
        if (total1 != total2) {
            System.out.println("bilangan berbeda");
        }
    }
}
