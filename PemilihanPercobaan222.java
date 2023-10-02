import java.util.Scanner;

public class PemilihanPercobaan222 {
    public static void main (String [] args) {

        Scanner input22 = new Scanner(System.in);

        System.out.println("Nilai uas   : ");
        float uas = input22.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input22.nextFloat();
        System.out.println("Nilai kuis  : ");
        float kuis = input22.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input22.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas* 0.2F);
        if (total > 80 || total <= 100){
            System.out.println("Sangat baik");
        }
        else if (total > 73 || total <= 80){
            System.out.println("Lebih dari baik");
        }
        else if (total > 65 || total <= 73){
            System.out.println("Baik");
        }
        else if (total > 60 || total <= 65){
             System.out.println("Lebih dari Cukup");
        }
        else if (total > 50 || total <= 60){
            System.out.println("Cukup");
        }
        else if (total > 39 || total <= 50){
            System.out.println("Kurang");
        }
        else{
            System.out.println("Gagal");
        }
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

    }
}