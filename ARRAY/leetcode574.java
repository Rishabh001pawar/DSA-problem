package ARRAY;

// LEETCODE 574 Distribute Candies

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
class solution{
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(candyType[i]);
        }
        return Math.min(set.size(),n/2);
    }
}

class Soution{
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int m=n/2;
        Arrays.sort(candyType);
        int count =1;
        for(int i=1;i<n;i++){
            if(candyType[i]!=candyType[i-1]){
                count++;
            }
        }
        return Math.min(count,m);
    }
}