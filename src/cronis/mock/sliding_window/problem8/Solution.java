package cronis.mock.sliding_window.problem8;

import java.util.*;

// My solution
public class Solution {
    public static void main(String[] args) {
        var s = new Solution().getUnknownWords("ilikedordogc");
        System.out.println(s);
    }

    Set<String> set = new HashSet<>(Arrays.asList(new String[]{"like", "dog"}));

    String getExistsWord(String str, int startIndex) {
        var sb = new StringBuilder();
        while (startIndex < str.length()) {
            char c = str.charAt(startIndex);
            sb.append(c);
            if (set.contains(sb.toString())) return sb.toString();

            startIndex++;
        }
        return null;
    }

    String getUnknownWords(String str) {
        var unknownWords = new StringBuilder();
        var setList = new ArrayList<String>(set);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (String word : setList) {
                if (!word.startsWith("" + c)) {
                    unknownWords.append(c);
                    break;
                }
            }
        }

        return unknownWords.toString();
    }
}

// Solution after
class Solution2 {
    public static void main(String[] args) {
        var s = new Solution2().parseSentenceStr("ilikedordogc", new HashSet<>(Arrays.asList("like", "dog")));
        System.out.println(s);
    }

    String getExistWord(String str, int startIndex, Set<String> words) {
        for (var word : words) {
            char letter = str.charAt(startIndex);

            // 012345
            // xxxcat    3 + 3 - 1 = 5
            int endIndex = startIndex + word.length() - 1;

            if (endIndex < str.length() && word.charAt(0) == letter) {
                // start включительно
                // end не включительно
                var candidate = str.substring(startIndex, endIndex + 1);
                if (candidate.equals(word)) return candidate;
            }
        }

        return null;
    }

    // str = ilikedogs
    // set = {dog, like}
    String parseSentenceStr(String str, Set<String> words) {
        int windowStart = 0;
        int windowEnd = 0;
        var parsedSentence = new StringBuilder();

        while (windowEnd < str.length()) {
            var word = getExistWord(str, windowEnd, words);
            if (word != null) {
                if (parsedSentence.charAt(parsedSentence.length() - 1) == ' ') {
                    parsedSentence.append(word + " ");
                } else {
                    parsedSentence.append(" " + word + " ");
                }
                windowStart = windowEnd + 1;
            } else {
                System.out.println(word);
            }

            windowEnd++;
        }

        return parsedSentence.toString();
    }
}
