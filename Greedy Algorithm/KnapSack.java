import java.util.*;
public class KnapSack {
    public static  double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        double[][] ratio = new double[n][2];  //0-> idx 1-> ratio
        double value = 0;
        //stored ratios
        for(int i=0; i<n; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];  //ratio
        }
        Arrays.sort(ratio , Comparator.comparingDouble(o->o[1])); //basis of wt asc order
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= wt[idx]){
                value+=val[idx];
                capacity-=wt[idx];
            }else{
                //break part
                value += (ratio[i][1] * capacity);
                capacity=0;
                break;
            }
        }
        return value;



    }
    public static void main(String[] args) {
        int[] val = {8, 2, 10, 1, 9, 7, 2, 6, 4, 9};
        int[] wt = { 10, 1, 7, 7, 5, 1, 8, 6, 8, 7};
        System.out.println(fractionalKnapsack(val, wt, 21));
        
    }
}
