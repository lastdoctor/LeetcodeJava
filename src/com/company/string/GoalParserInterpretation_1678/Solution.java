package com.company.string.GoalParserInterpretation_1678;

class Solution {
    public String interpret(String command) {
        String ans = "";
        if (command.charAt(0) == 'G'){
            ans += 'G';
        }
        for (int i = 1; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                ans += command.charAt(i);
            } else {
                if (command.charAt(i) == 'a') {
                    ans += "al";
                }
                if (command.charAt(i - 1) == '(' && command.charAt(i) == ')' ) {
                    ans += 'o';
                }
            }
        }
        return ans;
    }
}
