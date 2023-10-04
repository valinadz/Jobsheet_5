import java.util.Scanner;

public class SistemLogin {
    public static void main (String []args) {
        
        String username = "namauser";
        String password = "user123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username:  ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan Password:  ");
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