public class NextDays {
    public static boolean isLeapYear(int year) {
        boolean result = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    result = true;
                }
            } else
                result = true;
        }
        return result;
    }

    public static String nextDay(int day, int month, int year) {
        int currentDay = 0;
        int currentMonth = 0;
        int currentYear = 0;

        switch (month) {
            case 1:
            case 3:
            case 7:
            case 8:
            case 10:
                if (day < 31 && day > 0) {
                    currentDay = day + 1;
                    currentMonth = month;
                    currentYear = year;
                } else if (day == 31) {
                    currentDay = 1;
                    currentMonth = month + 1;
                    currentYear = year;
                } else
                    System.out.println("Ngay Khong Hop Le");
                break;
            case 2:
                if (isLeapYear(year)) {
                    if (day < 29 && day > 0) {
                        currentDay = day + 1;
                        currentMonth = month;
                        currentYear = year;
                    } else if (day == 29) {
                        currentDay = 1;
                        currentMonth = month + 1;
                        currentYear = year;
                    } else
                        System.out.println("Ngay Khong Hop Le");
                } else {
                    if (day < 28 && day > 0) {
                        currentDay = day + 1;
                        currentMonth = month;
                        currentYear = year;
                    } else if (day == 28) {
                        currentDay = 1;
                        currentMonth = month + 1;
                        currentYear = year;
                    } else
                        System.out.println("Ngay Khong Hop Le");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30 && day > 0) {
                    currentDay = day + 1;
                    currentMonth = month;
                    currentYear = year;
                } else if (day == 30) {
                    currentDay = 1;
                    currentMonth = month + 1;
                    currentYear = year;
                } else
                    System.out.println("Ngay Khong Hop Le");
                break;
            case 12:
                if (day < 31 && day > 0) {
                    currentDay = day + 1;
                    currentMonth = month;
                    currentYear = year;
                } else if (day == 31) {
                    currentDay = 1;
                    currentMonth = 1;
                    currentYear = year + 1;
                } else
                    System.out.println("Ngay Khong Hop Le");
                break;
        }
        return currentDay + " " + currentMonth + " " + currentYear;
    }

//    public static void main(String[] args) {
//        System.out.println(nextDay(29, 2, 2020));
//    }
}
