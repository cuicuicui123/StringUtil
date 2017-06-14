package com.example.mc100.stringutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String mDate = "2017-6-14";
    private String mTime = "8:49:00";
    private String mDateAndTime = "2017-6-14 8:49:00";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String date = StringUtil.formatDate(mDate);
        String time = StringUtil.formatTime(mTime);
        String timeNoSecond = StringUtil.formatTimeNoSecond(mTime);
        String dateAndTime = StringUtil.formatDateTime(mDateAndTime);
        String dateAndTimeNoSecond = StringUtil.formatDateTimeNoSecond(mDateAndTime);
        String dateText = StringUtil.formatDateText(mDate);
        String dateTextNoYear = StringUtil.formatDateTextNoYear(mDate);
        Log.i("date", date + "\n"
                + time + "\n"
                + timeNoSecond + "\n"
                + dateAndTime + "\n"
                + dateAndTimeNoSecond + "\n"
                + dateText + "\n"
                + dateTextNoYear);

    }
}
