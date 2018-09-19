/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enkapsulasi;

/**
 *
 * @author El-Savira
 */
public class Biodata {
    public static void main(String[] args){
        BiodataKeluarga bdt = new BiodataKeluarga();
        bdt.namaAyah    = "Mahmud Yunus";
        bdt.namaIbu     = "Mardiana Wahyuningtyas";
        bdt.namaSaudara = "Akmal Ahmad Ghozali";
        bdt.tempatLahir = "Malang";
        bdt.Hobi        = "Menggambar";
        bdt.cita        = "Arsitek";
        bdt.bulan       = " Maret ";
        bdt.thn         = 2003;
        bdt.tgl         = 05;
        bdt.tlp         = "087712644463";
        bdt.cetak();
    }
}
