import java.util.Scanner;

public class Weapon {
    public static void main (String []args) {
        
        String Weapon;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jarak:  ");
        int jarak = input.nextInt();
        
        if (jarak <= 5){
            System.out.println("Melee Weapon");
        }
        else{
            System.out.println("Ranged Weapon");
        }

    }
}