package Lesson8HW.ENUM;

public class Solution2 {
    public static void main(String[] args) {
        Week week = Week.SATURDAY;
        System.out.println(week.simpleName + " - day of the week: " + week.dayOfWeek);

    }

    public enum Week {
        MONDAY(1, "Monday" ),
        TUESDAY(2, "Tuesday"),
        WEDNESDAY(3, "Wednesday"),
        THURSDAY(4, "Thursday"),
        FRIDAY(5, "Friday"),
        SATURDAY(6, "Saturday"),
        SUNDAY(7, "Sunday");
        private final int dayOfWeek;
        private final String simpleName;

        Week(int dayOfWeek, String simpleName) {
            this.dayOfWeek = dayOfWeek;

            this.simpleName = simpleName;
        }
        public void printDayOfWeek(){
            System.out.println(dayOfWeek);
        }
        public void printSimpleName(){
            System.out.println(simpleName);
        }
    }
}
