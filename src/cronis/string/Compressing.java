package cronis.string;

public class Compressing {
    public static void main(String... args) {
        Compressing c = new Compressing();
        String s = c.compressing("aabcccccaaa");
        System.out.println(s);
    }

    private String compressing(String s) {
        int[] letters = new int[26];
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            int count = letters[c - 'a'];
            ans.append(c);
            ans.append(count);
        }
        return ans.toString();
    }
}
