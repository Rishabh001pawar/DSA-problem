package ARRAY;

// 1095. Find in Mountain Array
public class binar2 {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int n=mountainArr.length();
        int leftSearch=bs(mountainArr,0,peak,target,true);
        if(leftSearch!=-1){
            return leftSearch;
        }
        return bs(mountainArr,peak+1,n-1,target,false);
    }
    private int findPeak(MountainArray mountainArr){
        int low=0;
        int high=mountainArr.length()-1;
        while(low<high){
            int mid=low + (high-low)/2;
            if(mountainArr[mid]<mountainArr.get(mid+1)){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
    private int bs(MountainArray mountainArr,int low,int high,int target,boolean asc){
        while(low<=high){
            int mid=low+(high-low)/2;
            int midVal=mountainArr.get(mid);
            if(midVal==target){
                return mid;
            }
            if(asc){
                if(midVal<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                if(midVal>target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        MountainArray mountainArr = new MountainArray();
        int target=3;
        binar2 obj=new binar2();
        System.out.println(obj.findInMountainArray(target,mountainArr));
    }
}
