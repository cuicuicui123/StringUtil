package com.example.mc100.stringutil;

/**
 * @author Cuiweicong
 */

public class StringUtil {
    public static String formatDate(String date){
        if (date == null || date.equals("") || !(date.contains("-") || date.contains("/"))) {
            return null;
        }
        if (date.contains(" ")) {
            date = date.split(" ")[0];
        }
        String split = date.contains("-") ? "-" : "/";
        String[] dates = date.split(split);
        if (dates.length > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(dates[0]);
            for (int i = 1;i < dates.length;i ++) {
                sb.append("-");
                int dateInt = Integer.parseInt(dates[i]);
                sb.append(dateInt < 10 ? "0" + dateInt : dateInt);
            }
            return sb.toString();
        } else {
            return null;
        }
    }

    public static String formatTime(String time){
        if (time == null || time.equals("") || !time.contains(":")) {
            return null;
        }
        if (time.contains(" ")) {
            time = time.split(" ")[1];
        }

        String split = ":";
        String[] times = time.split(split);
        if (times.length > 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0;i < times.length;i ++) {
                int timeInt = Integer.parseInt(times[i]);
                sb.append(timeInt < 10 ? "0" + timeInt : timeInt);
                if (i < times.length - 1) {
                    sb.append(":");
                }
            }
            return sb.toString();
        } else {
            return null;
        }
    }

    public static String formatTimeNoSecond(String time){
        if (time == null || time.equals("") || !time.contains(":")) {
            return null;
        }
        if (time.contains(" ")) {
            time = time.split(" ")[1];
        }

        String split = ":";
        String[] times = time.split(split);
        if (times.length > 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0;i < times.length - 1;i ++) {
                int timeInt = Integer.parseInt(times[i]);
                sb.append(timeInt < 10 ? "0" + timeInt : timeInt);
                if (i < times.length - 2) {
                    sb.append(":");
                }
            }
            return sb.toString();
        } else {
            return null;
        }
    }

    public static String formatDateTime(String dateTime){
        if (dateTime == null || dateTime.equals("") || !dateTime.contains(" ")) {
            return null;
        }
        String date = dateTime.split(" ")[0];
        date = formatDate(date);
        String time = dateTime.split(" ")[1];
        time = formatTime(time);
        return date + " " + time;
    }

    public static String formatDateTimeNoSecond(String dateTime){
        if (dateTime == null || dateTime.equals("") || !dateTime.contains(" ")) {
            return null;
        }
        String date = dateTime.split(" ")[0];
        date = formatDate(date);
        String time = dateTime.split(" ")[1];
        time = formatTimeNoSecond(time);
        return date + " " + time;
    }

    public static String formatDateText(String date){
        if (date == null || date.equals("") || !(date.contains("-") || date.contains("/"))) {
            return null;
        }
        if (date.contains(" ")) {
            date = date.split(" ")[0];
        }
        String split = date.contains("-") ? "-" : "/";
        String[] dates = date.split(split);
        if (dates.length > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(dates[0] + "年");
            sb.append(dates[1] + "月");
            if (dates.length > 2) {
                sb.append(dates[2] + "日");
            }
            return sb.toString();
        } else {
            return null;
        }
    }

    public static String formatDateTextNoYear(String date){
        if (date == null || date.equals("") || !(date.contains("-") || date.contains("/"))) {
            return null;
        }
        if (date.contains(" ")) {
            date = date.split(" ")[0];
        }
        String split = date.contains("-") ? "-" : "/";
        String[] dates = date.split(split);
        if (dates.length > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(dates[1] + "月");
            if (dates.length > 2) {
                sb.append(dates[2] + "日");
            }
            return sb.toString();
        } else {
            return null;
        }
    }

}
