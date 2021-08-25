package com.company.array.CheckIfTwoStringArraysAreEquivalent_1662;


// Solution String to array
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return (String.join("", word1).equals(String.join("", word2)));
    }
}


