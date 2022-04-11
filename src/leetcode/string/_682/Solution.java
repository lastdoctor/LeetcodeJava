package leetcode.string._682;

import java.util.*;

class Solution {
    public int calPoints(String[] ops) {
        var st = new LinkedList<Integer>();
        int sum = 0;
        for (String op : ops) {
            if (op.equals("D")) {
                sum += st.peekLast() * 2;
                st.addLast(st.peekLast() * 2);
            } else if (op.equals("C")) {
                sum -= st.removeLast();
            } else if (op.equals("+")) {
                int n1 = st.get(st.size() - 2);
                int n2 = st.get(st.size() - 1);
                st.addLast(n1 + n2);
                sum += n1 + n2;
            } else {
                sum += Integer.parseInt(op);
                st.addLast(Integer.parseInt(op));
            }
        }

        return sum;
    }
}
