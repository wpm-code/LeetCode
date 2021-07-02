package test;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(maxLen("abcbead"));
    }
    public static String maxLen(String str) {
        int max=0;
        int length=str.length();
        String result="";
        for(int i=0 ;i< length ;i++){
            for(int j=i+1 ;j <= length ;j++){
                if(isTrue(str.substring(i, j),j-i)){
                    if(j-i>max){
                        max=j-i;
                        result=str.substring(i,j);
                    }
                }
            }
        }
        return result;
    }
    public static boolean isTrue(String str, int n){
        int k = n / 2;
        for (int i = 0; i < k; ++i)
        {
            if (str.charAt(i) != str.charAt(n-1-i))
                return false;
        }
        return true;
    }
}
