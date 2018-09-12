/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan01;

/**
 *
 * @author El-Savira
 */
public class Latihan03 {
    public static void cetakangka(int angka){
        if (angka >= 1) {
            System.out.print(angka + " ");
            cetakangka(--angka);
        }
    }
    
}
