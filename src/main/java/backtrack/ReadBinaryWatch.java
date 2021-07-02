package backtrack;

import java.util.ArrayList;
import java.util.List;

public class ReadBinaryWatch {
    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
    }
    public static List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                int cnt = Integer.bitCount(i)+Integer.bitCount(j);
                if (cnt == num) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i).append(':');
                    if (j < 10) {
                        sb.append('0');
                    }
                    sb.append(j);
                    list.add(sb.toString());
                }
            }
        }
        return list;
    }
}
