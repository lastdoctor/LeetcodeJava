package cronis.string;

public class StringHasOneReplace {
    public static void main(String... args) {
        boolean s = new StringHasOneReplace().strHasOneEdit("bear", "beer");
        System.out.println(s);
    }

    private boolean stringHasOneReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) return false;
                foundDifference = true;
            }
        }

        return  true;
    }

    private boolean strHasOneInsert(String source, String edited) {
        int sIdx = 0;
        int eidx = 0;
        while (eidx < edited.length()) {
            if (source.charAt(sIdx) == edited.charAt(eidx)) {
                sIdx++;
                eidx++;
            } else {
                if (sIdx == eidx) eidx++;
                else return false;
            }
        }

        return true;
    }

    private boolean strHasOneEdit(String source, String edited) {
        if (source.length() == edited.length()) return stringHasOneReplace(source, edited);
        if (source.length() == edited.length() - 1) return strHasOneInsert(source, edited);
        if (source.length() == edited.length() + 1) return strHasOneInsert(source, edited);

        return false;
    }
}
