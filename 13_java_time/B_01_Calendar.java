public class B_01_Calendar {
    public static void main(String[] args) {
        //		Calendar a = new Clendar();//
                Calendar a = Calendar.getInstance();//Object cannot be created because it is an abstract class.
                Calendar b = new GregorianCalendar();
                System.out.println(a.toString());
                //java.util.GregorianCalendar[time=1639886686090,areFieldsSet=true,
                //areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[
                //id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,
                //transitions=22,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,
                //ERA=1,YEAR=2021,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=19,
                //DAY_OF_YEAR=353,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=1,
                //HOUR_OF_DAY=13,MINUTE=4,SECOND=46,MILLISECOND=90,ZONE_OFFSET=32400000,
                //DST_OFFSET=0]
                System.out.println(b.toString());
            }
        }
        