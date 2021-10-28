package cronis.string;

public class PalindromeMaker {
    public static void main(String... args) {
        PalindromeMaker p = new PalindromeMaker();
        boolean temp = p.palindromeMaker("bbo");
        System.out.println(temp);
    }

    private boolean palindromeMaker(String s) {
        int[] words = new int[26];
        for (char c : s.toCharArray()) {
            words[c - 'a']++;
        }

        int oneCount = 0;
        for (int num : words) {
            if (num == 1) oneCount++;
            else if (num % 2 == 1) return false;

            if (oneCount > 1) return false;
        }
        return true;
    }
}
