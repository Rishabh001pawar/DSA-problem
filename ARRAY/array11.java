package ARRAY;

import java.util.Arrays;

// Arrange given numbers to form the biggest number
public class array11 {
    public static String findLargest(int[]arr){
            String[]str = new String[arr.length];
            for(int i=0;i<arr.length;i++){
                str[i]=String.valueOf(arr[i]);
            }
            Arrays.sort(str, (a, b) -> {
                String order = a + b;
                String order1 = b + a;
                return order1.compareTo(order);
            });
            StringBuilder sb = new StringBuilder();
    
            for(String s:str){
                sb.append(s);
            }
            if(str.equals("0")){
                return "0";
            }
            return sb.toString();
        }
    public static void main(String[] args) {
        int[] arr = { 3, 30, 34, 5, 9 };
        System.out.println(findLargest(arr));
    }
}

