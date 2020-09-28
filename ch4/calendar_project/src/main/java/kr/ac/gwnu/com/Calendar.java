package kr.ac.gwnu.com;

public class Calendar {
    public String askDay(int year, int month, int day) {
        int totalDays = 0;
        int[] monthDays = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String result = null;

        for (int i = 1; i < year; i++) {
            if (i % 4 == 0) {
                if (i % 100 == 0) {
                    if (i % 400 == 0) {
                        totalDays = totalDays + 366;
                    }
                    else {
                        totalDays = totalDays + 365;
                    }
                }
                else {
                    totalDays = totalDays + 366;
                }
            }
            else {
                totalDays = totalDays + 365;
            }
        }

        for (int m = 1; m < month; m++) {
            totalDays = totalDays + monthDays[m];
        }

        if (month >= 3) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        totalDays = totalDays + 1;
                    }
                }
                else {
                    totalDays = totalDays + 1;
                }
            }
        }

        totalDays = totalDays + day;

        switch (totalDays % 7) {
            case 1:
                result = "월요일";
                break;
            case 2:
                result = "화요일";
                break;
            case 3:
                result = "수요일";
                break;
            case 4:
                result = "목요일";
                break;
            case 5:
                result = "금요일";
                break;
            case 6:
                result = "토요일";
                break;
            case 0:
                result = "일요일";
                break;
        }

        return result;
    }
}
