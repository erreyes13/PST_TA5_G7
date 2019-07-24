package com.example.amst7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

public class Calendar extends AppCompatActivity {
long date;
CalendarView cv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        cv = (CalendarView) findViewById(R.id.calendarView);
        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                date = cv.getDate();
                Toast.makeText(view.getContext(), "Date: " + year + "/" + month + "/" + dayOfMonth +
                        "\n" + "    TAREA #" + dayOfMonth, Toast.LENGTH_LONG).show();
            }
        });
    }



    public void volver(View view){
        finish();
    }

}
