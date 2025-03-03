package String;
// leetcode 345. Reverse Vowels of a String
public class str2 {
    public String reverseVowels(String s) {
        int n=s.length();
        int start=0;
        int end=n-1;
        char[] ch=s.toCharArray();
        while(start<end){
            if(!isVowels(ch[start])){
                start++;
            }
            else if(!isVowels(ch[end])){
                end--;
            }
            else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
    private boolean isVowels(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
