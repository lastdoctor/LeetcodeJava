package leetcode.string.DefangingAnIPAddress_1108;

// Time O(n) Space O(1);
class Solution {
    public String defangIPaddr(String address) {
        String ans = "";
        for (char c : address.toCharArray()) {
            if (c != '.') {
                ans += c;
            } else {
                ans += "[.]";
            }
        }
        return ans;
    }
}
