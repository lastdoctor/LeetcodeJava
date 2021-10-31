package cronis.recursion;

public class EndToStart {
    public static void main(String[] args) {
        String s = "29641";
        String e = new EndToStart().endToStart(s, s.length());
        System.out.println(e);
    }

    private String endToStart(String s, int end) {
        if (end == 2) return s.charAt(0) + "," + s.charAt(1) + "";
        return s.charAt(end - 1) + "," + endToStart(s, end - 1);
    }
}
