class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        String[] days = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

        int oddDays = 0;
        for (int i = 1971; i < year; i++) {
            oddDays += isLeap(i) ? 2 : 1;
        }

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeap(year)) {
            monthDays[1] = 29;
        }

        for (int i = 0; i < month - 1; i++) {
            oddDays += monthDays[i];
        }
        oddDays += day;
        return days[oddDays % 7];
    }

    boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

