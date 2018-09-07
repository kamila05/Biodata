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
public class ProgramKasir {
    public static void main(String[] args) {
        Scanner KeyB = new Scanner(System.in);
        String nama_pembeli;
        byte anggota, proses_diulang, jumlah_barang;
        double harga_barang, diskon, harga_bayar, total_harga_barang;
        do {
            System.out.print("Nama Pembeli        : "); nama_pembeli  = KeyB.next();
            System.out.print("Jumlah Barang       : "); jumlah_barang = KeyB.nextByte();
            System.out.print("Harga Barang Satuan : "); harga_barang  = KeyB.nextDouble();
            System.out.print("Apakah pembeli adalah anggota ? 1. Ya, 2. Tidak : ");  anggota = KeyB.nextByte();
            total_harga_barang = jumlah_barang * harga_barang;
            diskon = 0;
            if (total_harga_barang > 1000000) {
                diskon = 0.10 * total_harga_barang;
                if (anggota == 1) {
                    diskon = 0.20 * total_harga_barang;
                }
            }
            harga_bayar = total_harga_barang - diskon;
            System.out.println("Total Harga Barang : " + String.format("%1$,.2f", total_harga_barang));
            System.out.println("Diskon             : " + String.format("%1$,.2f",diskon));
            System.out.println("Harga Bayar        : " + String.format("%1$,.2f",harga_bayar));
            System.out.print("Apakah proses akan diulang ? 1. Ya, 2. Tidak : ");  proses_diulang = KeyB.nextByte();
        } while (proses_diulang == 1);
        System.out.print("Program selesai...");
    }
}
