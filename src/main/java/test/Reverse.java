package test;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        for (int i = strings.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(strings[i]);
            } else {
                System.out.print(strings[i]+" ");
            }
        }
    }
}
