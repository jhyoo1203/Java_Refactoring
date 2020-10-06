package kr.ac.gwnu.com.ch5;

public class Calendar {
    private String[] dayNames = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
    private int[] monthDays = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Calendar() {

    }

    public String askDay(int year, int month, int day) {
        int totalDays = 0;

        totalDays += calculateTotalDays(year, month, day);

        return dayNames[totalDays % 7];
    }

    private int calculateTotalDays(int year, int month, int day) {
        int totalDays = 0;

        for (int y = 1; y < year; y++) {
            if (isLeap(y))
                totalDays += 366;
            else
                totalDays += 365;
        }

        for (int m = 1; m < month; m++)
            totalDays += monthDays[m];

        if (isLeap(year) && month >= 3)
            totalDays++;

        totalDays += day;

        return totalDays;
    }

    private boolean isLeap(int year) {
        boolean result = false;

        if (year % 400 == 0)
            result = true;
        else if (year % 100 == 0)
            result = false;
        else if (year % 4 == 0)
            result = true;
        else
            result = false;

        return result;
    }
}
