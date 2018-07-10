import java.util.*;
import java.text.*;

public class DateDemo {
    public static void main(String[] args) {
        Date dNow = new Date();

        System.out.println(dNow.toString());

        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));

        System.out.printf("全部日期和时间信息：%tc%n", dNow);
        System.out.printf("年-月-日格式：%tF%n", dNow);
        System.out.printf("月/日/年格式：%tD%n", dNow);
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", dNow);
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", dNow);
        System.out.printf("HH:MM格式（24时制）：%tR%n", dNow);

        System.out.printf("%1$s %2$tB %2$td, %2$tY%n", "Due date:", dNow);

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1888-11-11" : args[0];
        System.out.print(input + " Parses as ");

        Date t;
        try {
            t = fmt.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + fmt);
        }
    }
}
