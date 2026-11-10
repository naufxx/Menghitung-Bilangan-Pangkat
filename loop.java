import java.util.*;
public class loop {
    public static void main(String[] args){
        String garis = "=".repeat(50);
        System.out.println(garis);
        System.out.println("PROGRAM MENGHITUNG BILANGAN PANGKAT");
        System.out.println(garis);
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        double bilangan = input.nextDouble();
        System.out.print("Masukkan pangkat: ");
        int pangkat = input.nextInt();
        double hasil = 1;

        int n = pangkat;
        if (n < 0){
            n = -n;
        }

        for (int i = 1; i <= n; i++){
            hasil *= bilangan;
        }
        if (pangkat < 0){
            hasil = 1 / hasil;
        }

        System.out.println(bilangan + " pangkat " + pangkat + " = " + hasil);
    }
}