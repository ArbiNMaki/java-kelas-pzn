package Standard;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        System.out.println("==========");

        Calendar kalender = Calendar.getInstance();
        kalender.set(Calendar.YEAR, 2024);
        kalender.set(Calendar.MONTH, Calendar.MAY);
        kalender.set(Calendar.DAY_OF_MONTH, 14);
        kalender.set(Calendar.HOUR_OF_DAY, 23);
        kalender.set(Calendar.MINUTE, 44);
        kalender.set(Calendar.SECOND, 0);
        kalender.set(Calendar.MILLISECOND, 0);

        Date tanggal = kalender.getTime();
        long ms = date.getTime();

        System.out.println(tanggal);
    }
}
