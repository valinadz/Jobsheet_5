import java.util.Scanner;

public class FiturLogin1 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        // Verifikasi informasi login
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil. Selamat datang, " + username + "!");
        } else {
            System.out.println("Login gagal. Silakan coba lagi.");
        }

        scanner.close();
    }
}