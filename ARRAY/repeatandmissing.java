package ARRAY;
// You are given a read only array of n integers from 1 to n.
// Each integer appears exactly once except A which appears twice and B which is missing.
// Return A and B.
// Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
// Note that in your output A should precede B.
// Example:
// Input:[3 1 2 5 3] 
// Output:[3, 4] 
// A = 3, B = 4

class RepeatAndMissing {
    public static int[] findMissingRepeatingNumbers(int[] arr) {
        int n=arr.length;
        int repeating=1;
        int missing=-1;
        int[] Res=new int [n+1];

        for(int i=1;i<n;i++){
            Res[arr[i]]++;
        }

        for(int i=1;i<n;i++){
            if(Res[i]==2){
                repeating=i;
            }else if(Res[i]==0){
                missing=i;
            }
            if(repeating!=-1 && missing!=-1){
                break;
            }
        }
        // Placeholder return statement
        return new int[]{repeating, missing};
    }
    public static void main(String[] args) {
        int []a={3,1, 2, 5, 3};
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans[0] + ", " + ans[1] + "}");

    }
}
