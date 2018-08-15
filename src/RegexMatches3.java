import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches3 {
    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoobkkk";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()) {
            m.appendReplacement(sb, REPLACE);
            System.out.println(sb.toString());
        }
        System.out.println(sb.toString());
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
