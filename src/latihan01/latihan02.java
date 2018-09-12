package latihan01;

import static latihan01.Latihan01.cetak;

/**
 *
 * @author El-Savira
 */
public class latihan02 {
    public static void cetak(int i) {
        if (i>0){
            System.out.println("SMK Telkom Malang");
            cetak(--i); 
        }
    }    
}
