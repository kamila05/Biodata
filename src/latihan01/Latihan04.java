package latihan01;

/**
 *
 * @author El-Savira
 */
public class Latihan04 {
    public static int total(int N){
        if (N > 1){
            return(N + total(--N));
        }
        else return(1);
    }
    
}
