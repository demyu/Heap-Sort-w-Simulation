/**
 * theQueue
 */
public class theQueue {

    private int i,k;
    private double[] oldValues;

    public theQueue(int i, int k, double[] oldValues){
        this.i=i;
        this.k=k;
        this.oldValues = oldValues;
    }

    public int getI(){
        return i;
    }

    public int getK(){
        return k;
    }

    public double[] getOldValues(){
        return oldValues;
    }

    public void setI(int I){
        this.i = I;
    }

    public void setK(int K){
        this.k = K;
    }

    public void toStr(){
        System.out.print(" " + "(" + getI() + "," + getK() + ")" + " ");
    }
}