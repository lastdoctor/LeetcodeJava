package cronis.string;

public class Compressing {
    public static void main(String... args) {
        Compressing c = new Compressing();
        String s = c.compress("aabcccccaaa");
        System.out.println(s);
    }

    private String compress(String s) {
        StringBuilder ans = new StringBuilder();
        int sameLetterCount = 0;
        for (int i = 0; i < s.length(); i++) {
            sameLetterCount++;
            char currentLetter = s.charAt(i);
            boolean isLastLetter = (i == s.length() - 1);

            if (isLastLetter || currentLetter != s.charAt(i + 1)) {
                ans.append(currentLetter);
                ans.append(sameLetterCount);
                sameLetterCount = 0;
            }
        }

        return ans.length() < s.length() ? ans.toString() : s;
    }
}
