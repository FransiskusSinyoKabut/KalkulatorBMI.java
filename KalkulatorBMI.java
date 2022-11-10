import java.util.Scanner;

public class KalkulatorBMI {
    public static void main(String[] args) {
        // buat scanner
        Scanner scan = new Scanner(System.in);

        // instruksi awal
        System.out.println("BMI Kalkulator");
        System.out.println("Masukkan Berat Bedan (Kg).");

        // scan berat badan
        double berat = scan.nextDouble();

        // instruksi
        System.out.println("Masukkan Tinggi Badan (cm).");
    
        // scan tinggi
        double tinggi = scan.nextDouble();

        // hitung BMI
        double Bmi = berat / (tinggi/100 * tinggi/100);

        //print BMI
        System.out.println("BMI anda " + Bmi);
 
        if (Bmi < 18.5) {System.out.println("Kurang berat badan");}
        else if (Bmi > 30) {System.out.println("Obesitas");}
        else if (Bmi > 25) {System.out.println("Kelebihan berat badan");}
        else {System.out.println("Normal");}

    }

}