package com.company.string.MaximumRepeatingSubstring_1668;

// Solution StringBuilder
// Time O(n) Space(1)
class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        while(sequence.contains(result.append(word))) count++;
        return count;
    }
}

// Solution String temp
class Solution1 {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String temp = word;
        while (sequence.contains(temp)) {
            count++;
            temp += word;
        }
        return count;
    }
}