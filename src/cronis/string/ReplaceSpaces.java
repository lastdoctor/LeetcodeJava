package cronis.string;

class ReplaceSpaces {
    public static void main(String... args) {
        ReplaceSpaces r = new ReplaceSpaces();
        r.replaceSpaces("dog is a good boy", 17);
    }
    private String replaceSpaces(String str, int length) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') ans.append("%20");
            else ans.append(str.charAt(i));
        }
        System.out.println(ans);
        return ans.toString();
    }
}
