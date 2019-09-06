package coding_interviews;

public class ci_02 {
    public String replaceSpace(StringBuffer str) {
        String s = new String(str);
        s = s.replaceAll(" ", "%20");
        return s;
    }
}
