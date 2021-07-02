package pointer;

/**
 * 判断是否为回文字符串
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int left = 0,right = stringBuilder.length()-1;
        while (left < right) {
            if (stringBuilder.charAt(left) != stringBuilder.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
