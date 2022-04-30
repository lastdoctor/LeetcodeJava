package cronis.lections.string;

class ReplaceSpaces {
    public static void main(String... args) {
        ReplaceSpaces r = new ReplaceSpaces();
        r.replaceSpaces("dog is a good boy ", 17);
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

class ReplaceSpaces1 {
    public static void main(String... args) {
        String r = new ReplaceSpaces1().replaceSpace("dog is a good boy ", 17);
        System.out.println(r);
    }


    private String replaceSpace(String str, int length) {
        char[] strArr = str.toCharArray();
        int tailIdx = strArr.length;

        for (int i = length - 1; i != 0; i--) {
            if (strArr[i] != ' ') {
                strArr[tailIdx - 1] = strArr[i];
                tailIdx--;
            } else {
                strArr[tailIdx - 1] = '0';
                strArr[tailIdx - 2] = '2';
                strArr[tailIdx - 3] = '%';
                tailIdx -= 3;
            }
        }

        return new String(strArr);
    }
}
