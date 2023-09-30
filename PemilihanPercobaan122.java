import java.util.Scanner;

public class PemilihanPercobaan122 {
    public static void main (String [] args) {

        String hasil;

        Scanner input22 = new Scanner(System.in);

        System.out.println("Masukkan angka:  ");
        int angka = input22.nextInt();

        hasil = (angka % 2 == 0) ? "Angka "+angka+" bilangan genap" : "Angka "+angka+" bilangan ganjil";
        System.out.println(hasil);

    }
}