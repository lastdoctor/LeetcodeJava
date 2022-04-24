package leetcode.design._535;

import java.util.*;

class Codec {
    Map<Integer, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        var random = new Random();
        int num = random.nextInt(1000000 - 1) + 1000000;
        map.put(num, longUrl);
        return "" + num;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int num = Integer.parseInt(shortUrl);
        return map.get(num);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
