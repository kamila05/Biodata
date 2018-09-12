package latihan01;

/**
 *
 * @author El-Savira
 */
public class Latihan05 {
    public static int faktorial(int N){
        if (N >= 1){
            return(N * faktorial(--N));
        }
        else return(1);
        
    }
}
