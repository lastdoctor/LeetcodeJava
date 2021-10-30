package cronis.string;

public class PalindromeMaker {
    public static void main(String... args) {
        PalindromeMaker p = new PalindromeMaker();
        boolean temp = p.palindromeMaker1("bbboosd");
        System.out.println(temp);
    }

    // Solve not all test cases
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

    private boolean palindromeMaker1(String s) {
        boolean[] letters = new boolean[26];
        int oddCount = 0;
        for (char letter : s.toCharArray()) {
            if (letter == ' ') continue;
            int letterCode = letter - 'a';
            // making opposite boolean
            letters[letterCode] = !letters[letterCode];
            if (letters[letterCode]) oddCount++;
            else oddCount--;
        }

        return oddCount <= 1;
    }
}