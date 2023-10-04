import java.util.Scanner;

public class NamaKaryawan {
    public static void main (String []args){

        Scanner input = new Scanner(System.in);

        String namaKaryawan;
        double gajiTotal;
        int JamKerja = 40;
        int jamLembur = 20;
        double tarifPerJam;
        int bonus = 10000;

        System.out.println("Masukkan Nama Karyawan");
        namaKaryawan = input.nextLine();

        System.out.println("Masukkan Tarif Per Jam");
        tarifPerJam = input.nextDouble();

        System.out.println("Masukkan Pajak");
        double pajak = input.nextDouble();

        if (JamKerja <= 40 && jamLembur <= 20) {
            gajiTotal = tarifPerJam * (JamKerja + jamLembur);
            gajiTotal -= pajak;
        } else{
            gajiTotal = (0.5 * jamLembur) + (1.5 * JamKerja) * tarifPerJam;
            gajiTotal += (bonus - pajak);
        }
        System.out.println("Gaji Anda adalah " + gajiTotal);
    }
}