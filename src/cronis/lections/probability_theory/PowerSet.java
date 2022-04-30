package cronis.lections.probability_theory;

import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        int[] set = {1, 2, 3, 4};
        new PowerSet().powerSet(set);
    }

    private void powerSet(int[] set) {
        long N = (long) Math.pow(2, set.length);
        List<List<Integer>> powerSet = new ArrayList<>();

        for (int counter = 0; counter < N; counter++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < set.length; j++) {
                if ((counter & (1 << j)) > 0) {
                    temp.add(set[j]);
                }
            }
            powerSet.add(temp);
        }

        System.out.println(powerSet);
    }
}
