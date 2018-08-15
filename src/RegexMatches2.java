import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches2 {
    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. " +
                                    "All dogs say meow";
    private static String REPLACE = "cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        String out1 = m.replaceAll(REPLACE);
        String out2 = m.replaceFirst(REPLACE);
        System.out.println(out1);
        System.out.println(out2);
    }
}
