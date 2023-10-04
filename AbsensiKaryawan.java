import java.util.Scanner;

public class AbsensiKaryawan {
    public static void main(String[] args) {
        // Variabel untuk menyimpan data karyawan
        String idKaryawan = "";
        String namaKaryawan = "";
        String absensiKaryawan = "";

        Scanner scanner = new Scanner(System.in);

        // Loop untuk meminta input pengguna
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Catat Absensi");
            System.out.println("2. Lihat Absensi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membaca karakter newline setelah meminta input integer

            if (pilihan == 1) {
                System.out.print("Masukkan ID karyawan: ");
                idKaryawan = scanner.nextLine();
                System.out.print("Masukkan nama karyawan: ");
                namaKaryawan = scanner.nextLine();
                System.out.print("Apakah karyawan ini hadir hari ini? (Ya/Tidak): ");
                absensiKaryawan = scanner.nextLine();

                System.out.println("Absensi karyawan berhasil dicatat.");
            } else if (pilihan == 2) {
                if (!idKaryawan.isEmpty()) {
                    System.out.println("Data Absensi Karyawan:");
                    System.out.println("ID: " + idKaryawan);
                    System.out.println("Nama: " + namaKaryawan);
                    System.out.println("Absensi: " + absensiKaryawan);
                } else {
                    System.out.println("Belum ada data absensi karyawan.");
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih, program selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}