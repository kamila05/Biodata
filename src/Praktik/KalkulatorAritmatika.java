/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktik;

/**
 *
 * @author El-Savira
 */
import java.util.Scanner;
public class KalkulatorAritmatika {
    public static void main(String[] args) {
        double a ,b ,c , tugas;
        Scanner masukan = new Scanner(System.in);
        System.out.println("=========Calculator=========");
        System.out.println(" 1. Penjumlahan (+) ");
        System.out.println(" 2. Pengurangan (-) ");
        System.out.println(" 3. Perkalian (*) ");
        System.out.println(" 4. Pembagian (/) ");
        System.out.println(" 5. Modulus (%) ");
        System.out.print("Pilih Tugas : ");   tugas = masukan.nextDouble();
        System.out.print("Bilangan pertama : ");  a = masukan.nextDouble();
        System.out.print("bilangan kedua : ");    b = masukan.nextDouble();
        if (tugas == 1) c = a + b;
        else if (tugas == 2) c = a - b;
        else if (tugas == 3) c = a * b;
        else if (tugas == 4) c = a / b;
        else c = a % b;
        System.out.println("Hasil = " + c);
        System.out.println("============================");
        System.out.println("Program selesai...");
    }
}
