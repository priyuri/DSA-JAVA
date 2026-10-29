import java.util.*;
public class MaxChain {
    public static int findLongestChain(int[][] pairs) {
        //sort in asc order in basis of end point
        Arrays.sort(pairs , Comparator.comparingDouble(o->o[1]));
        int count = 1;
        int lastpair = pairs[0][1];  //end
        for(int i=1; i<pairs.length; i++){
            for(int j=0; j<1; j++){
                if(pairs[i][j] > lastpair){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] pairs = {{1,2} , {2,3} , {3,4}};
        System.out.println(findLongestChain(pairs));
        
    }
}
