class Solution {
    public static boolean searchMatrix(int[][] mat, int x) {
        // code here
        for(int rows=0; rows<mat.length; rows++){
            for(int cols = 0; cols<mat[rows].length; cols++){
                if(mat[rows][cols]==x){
                    return true;
                }
            }
        }
        return false;
        
    }
    public static void main(String args[]){
        int[][] mat = {
            {6,23,21},
            {4,45,32},
            {69,11,87},
        };
        int x=32;
        System.out.println(searchMatrix(mat , x));
    }
}
