
import java.util.ArrayList;
import java.util.Random;

/**
 * Heap
 */
public class Heap {

    private int[] A;
    private int low = 10;
    private int high = 15;

    public Heap(){

        Random rand = new Random();
        A = new int[rand.nextInt(high+1-low)+low];
        for (int i = 0; i < A.length; i++) {
            A[i]= rand.nextInt(Integer.MAX_VALUE);
        }
    }

    public int[] getArray(){
        return A;
    }
}
