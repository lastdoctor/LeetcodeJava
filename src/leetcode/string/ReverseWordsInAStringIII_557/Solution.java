package leetcode.string.ReverseWordsInAStringIII_557;

class Solution {
    public String reverseWords(String s) {
        s += ' ';
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                temp.append(c);
            } else {
                temp.reverse();
                temp.append(c);
                ans.append(temp);
                temp.delete(0, temp.length());
            }

        }
        ans.delete(ans.length() - 1, ans.length());
        return ans.toString();
    }
}


class Solution1 {
    public String reverseWords(String input) {
        final StringBuilder result = new StringBuilder();
        final StringBuilder word = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                word.append(input.charAt(i));
            } else {
                result.append(word.reverse());
                result.append(" ");
                word.setLength(0);
            }
        }
        result.append(word.reverse());
        return result.toString();
    }
}


class Solution3 {
    public String reverseWords(String s) {
        int n = s.length()-1;
        var reversedWords = new StringBuilder();
        var currentWord = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                currentWord.reverse();
                currentWord.append(' ');
                reversedWords.append(currentWord.toString());
                currentWord.delete(0, reversedWords.length());
            } else {
                currentWord.append(c);
            }
        }

        if (currentWord.length() != 0) {
            currentWord.reverse();
            reversedWords.append(currentWord.toString());
        }

        return reversedWords.toString();
    }
}

class Solution4 {
    private String swap(String word, int start, int end) {
        char[] chars = word.toCharArray();

        char letter = chars[start];
        chars[start] = chars[end];
        chars[end] = letter;
        return new String(chars);
    }

    public String reverseWords(String s) {
        var words = s.split(" ");
        int i;
        for (i = 0; i < words.length; i++) {
            String word = words[i];
            int start = 0;
            int end = word.length()-1;
            while(start <= end) {
                word = swap(word, start, end);
                start++;
                end--;
            }
            words[i] = word;
        }

        return String.join(" ", words);
    }
}
