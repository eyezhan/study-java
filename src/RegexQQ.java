public class RegexQQ {
    public static void main(String[] args) {
        checkQQ("0123134");
    }

    public static void checkQQ(String qq) {
        String reg = "[1-9][0-9]{4,14}}";
        System.out.println(qq.matches(reg)?"合法qq":"非法qq");
    }
}
