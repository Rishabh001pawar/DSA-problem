package ARRAY;
//Space optimization using bit manipulations
public class array12 {
    public static void markMultiples(int a, int b) {
        for(int i=0;i<=b;i++){
            if(i%2==0 || i%5==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int a=2,b=10;
        markMultiples(a,b);
    }
}
