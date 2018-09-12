/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan01;

import java.util.Scanner;

/**
 *
 * @author El-Savira
 */
public class Latihan01 {
    
    
    public static void cetak(){
        System.out.println("SMK Telkom Malang");
        cetak();
    }

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        System.out.println("Asiyah Kamila El-Savira/X RPL 6/04");
        //Latihan01.cetak();
        //latihan02.cetak(5);
        System.out.print("Masukkan sembarang angka : ");
        int N = baca.nextInt();
        //Latihan03.cetakangka(N);
        //System.out.println("Total dari angka 1 sampai " + N + " = " + Latihan04.total(N));
        System.out.println(N + " Faktorial = " + Latihan05.faktorial(N));
    }
    
}
