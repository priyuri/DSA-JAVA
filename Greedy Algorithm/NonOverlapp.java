import java.util.*;
public class NonOverlapp {
    public static  int eraseOverlapIntervals(int[][] intervals) {
        //sort the array based on end point
        Arrays.sort(intervals , Comparator.comparingDouble(o->o[1]));
        int lastAct = intervals[0][1];  // last activity end point
        int count = 0;
        for(int i=1; i<intervals.length; i++){
            for(int j=0; j<1; j++){
                if(intervals[i][j] >= lastAct){
                    //update lastactivity
                    lastAct = intervals[i][1];
                }else{
                    count++;
                }
            }
        }
        return count;


    }
    public static void main(String[] args) {
        int[][] intervals = {{1,2} , {2,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
