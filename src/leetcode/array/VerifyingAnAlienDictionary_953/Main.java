package leetcode.array.VerifyingAnAlienDictionary_953;

public class Main {
    public static void main(String... args) {
        Solution s = new Solution();
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        s.isAlienSorted(words, order);
    }
}
