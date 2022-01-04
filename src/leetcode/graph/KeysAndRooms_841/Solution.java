package leetcode.graph.KeysAndRooms_841;

import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        var visited = new HashSet<Integer>();
        var st = new LinkedList<Integer>();
        st.addLast(0);
        while (!st.isEmpty()) {
            var key = st.removeLast();
            if (visited.contains(key)) continue;
            visited.add(key);
            for (int room : rooms.get(key)) {
                if (!visited.contains(room)) st.addLast(room);
            }
        }
        return visited.size() == rooms.size();
    }
}
