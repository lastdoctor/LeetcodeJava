package leetcode.bits.AddBinary_67;

// Space complexity O(1) Time complexity O(N + M)
class Solution {
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }
}

// Space complexity O(max(N, M)) Time complexity O(max(N, M))
class Solution1 {
    public String addBinary(String p, String m) {
        int p1 = p.length()-1, m1 = m.length() -1, carry = 0;

        var ans = new StringBuilder();
        while (p1 >= 0 || m1 >= 0) {
            int sum = carry;
            if (p1 >= 0) sum += p.charAt(p1--) -'0';
            if (m1 >= 0) sum += m.charAt(m1--) - '0';
            ans.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) ans.append(carry);

        return ans.reverse().toString();
    }
}