import java.util.*;
public class ActivitySelectionProblem {
    public static int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        int[][] activities = new int[n][3]; // 2D arrays
        for(int i=0; i<n; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = finish[i];
        }
        //sort on basis of finish
        Arrays.sort(activities , Comparator.comparingDouble(o -> o[2]));

        int lastactEnd = activities[0][2];  // finish
        int count = 1; // my 1st activity is completed
        for (int i = 1; i < n; i++) {
            if (activities[i][1] > lastactEnd) {
                count++;
                lastactEnd = activities[i][2];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] finish = { 2, 4, 6, 7, 9, 9 };
        System.out.println(activitySelection(start, finish));

    }
}
