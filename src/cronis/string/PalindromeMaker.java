package cronis.string;

public class PalindromeMaker {
    public static void main(String... args) {
        PalindromeMaker p = new PalindromeMaker();
        boolean temp = p.palindromeMaker("bbobbo");
        System.out.println(temp);
    }

    private boolean palindromeMaker(String s) {
        int[] words = new int[26];
        for (char c : s.toCharArray()) {
            words[c - 'a']++;
        }
        for (int num : words) {
            if (num == 0) continue;
            else if (num == 1) continue;
            else if (num % 2 == 1) return false;
        }
        return true;
    }
}
