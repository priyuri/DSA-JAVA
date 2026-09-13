package Strings;

public class uppercaseChar {
    public static String getCovertedString(String str){
        StringBuilder sb = new StringBuilder(" ");
        String arr[] = str.split(" ");
        for(int i=0; i<arr.length; i++){
            if(arr[i].length() <= 2){
                sb.append(arr[i].toLowerCase()+" ");
            }else{
                sb.append(arr[i].substring(0, 1).toUpperCase());
                sb.append(arr[i].substring(1).toLowerCase()+" ");
                
            }
            
            
        }
        return sb.toString().trim();

    }
    public static void main(String[] args) {
        
        String str ="First leTTeR of EACH Word";
        System.out.println(getCovertedString(str));
        
    }
}
