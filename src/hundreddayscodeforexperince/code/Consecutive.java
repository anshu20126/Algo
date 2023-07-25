package hundreddayscodeforexperince.code;

public class Consecutive {
    public static void main(String[] args) {
        String[] days = {"sunday", "monday", "tuesday"};
        System.out.println(consec(days));
    }

    public static boolean consec(String[] days) {
        String[] weekDays = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        
        int startIndex = -1;
        for (int i = 0; i < weekDays.length; i++) {
            if (days[0].equalsIgnoreCase(weekDays[i])) {
                startIndex = i;
                break;
            }
        }

        for (int i = 1; i < days.length; i++) {
            int nextIndex = (startIndex + i) % weekDays.length;
            if (!days[i].equalsIgnoreCase(weekDays[nextIndex])) {
                return false;
            }
        }

        return true;
    }
}
