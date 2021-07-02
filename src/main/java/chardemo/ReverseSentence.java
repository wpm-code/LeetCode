package chardemo;

import java.util.Stack;

public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println(reverseSentence("student. a am I"));
    }
    public static String reverseSentence (String str) {
        String[] split = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        if (split.length == 0) {
            for (int i = 0; i < str.length(); i++) {
                stringBuilder.append(" ");
            }
        }
        for (int i = split.length-1; i >= 0; --i) {
            if (i == 0) {
                stringBuilder.append(split[i]);
            } else {
                stringBuilder.append(split[i] + " ");
            }
        }
        return stringBuilder.toString();
    }
}
