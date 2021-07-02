package chardemo;

public class LeftRotateString {
    public static void main(String[] args) {
        System.out.println(leftRotateString("abcdefg", 3));
    }
    public static String leftRotateString (String str,int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.substring(n,str.length()));
        stringBuilder.append(str.substring(0,n));
        return stringBuilder.toString();
    }
}
