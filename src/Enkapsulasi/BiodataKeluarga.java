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
public class BiodataKeluarga {
    public String namaAyah;
    public String namaIbu;
    public String namaSaudara;
    public String tempatLahir;
    public String Hobi;
    public String cita;
    public String bulan;
    public int thn;
    public int tgl;
    public String tlp;
    
    public void cetak(){
        System.out.println("Nama Ayah       : " + namaAyah);
        System.out.println("Nama Ibu        : " + namaIbu);
        System.out.println("Nama Saudara    : " + namaSaudara);
        System.out.println("Tempat Lahir    : " + tempatLahir);
        System.out.println("Tanggal Lahir   : " + tgl + bulan + thn);
        System.out.println("Hobi            : " + Hobi);
        System.out.println("Cita - Cita     : " + cita);
        System.out.println("No. Telpon      : " + tlp);
    }
}
