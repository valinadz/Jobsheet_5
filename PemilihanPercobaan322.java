import java.util.Scanner;

public class PemilihanPercobaan322 {
    public static void main (String [] args) {

        double angka1, angka2, hasil;
        char operator;

        Scanner input22 = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        angka1 = input22.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input22.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = input22.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);
              
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break; 
            case '*':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " * " + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " / " + angka2 + "=" + hasil);
                break;
        }
    }
}