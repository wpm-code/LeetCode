package list;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角，返回rowIndex数据
 */
public class GetRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            ArrayList<Integer> cur = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0 || j==i) {
                    cur.add(1);
                } else {
                    cur.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre = cur;
        }
        return pre;
    }
}
