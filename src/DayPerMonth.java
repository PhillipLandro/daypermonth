import org.jetbrains.annotations.NotNull;

public class DayPerMonth {

    public static int dayPerMonth(@NotNull Month month, int year){
        if(year > 1580 && month != null){
            if(month == Month.FEBRUARY){
                if(year % 4 != 0 || year % 100 == 0 && year % 400 != 0){
                    return 28;
                } else return 29;
            } else if (isMonthWith30Days(month)) {
                return 30;
            } else return 31;
        } else return 0;
    }

    public static boolean isMonthWith30Days(Month month){
        return month == Month.APRIL || month == Month.JUNE || month == Month.SEPTEMBER || month == Month.NOVEMBER;
    }



}
