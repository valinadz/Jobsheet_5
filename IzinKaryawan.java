import java.util.Scanner;

public class IzinKaryawan {
    public static void main(String[] args) {
        // Variabel untuk menyimpan izin pengguna
        boolean memilikiIzin = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Apakah karyawan memiliki izin? (Ya/Tidak)");
        String input = scanner.nextLine();

        // Memeriksa izin pengguna
        if (input.equalsIgnoreCase("Ya")) {
            memilikiIzin = true;
            System.out.println("Karyawan memiliki izin.");
        } else if (input.equalsIgnoreCase("Tidak")) {
            memilikiIzin = false;
            System.out.println("Karyawan tidak memiliki izin.");
        } else {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }

        // Contoh penggunaan izin
        if (memilikiIzin) {
            System.out.println("Karyawan dapat mengakses area terlarang.");
        } else {
            System.out.println("Karyawan tidak diizinkan mengakses area terlarang.");
        }

        scanner.close();
    }
}