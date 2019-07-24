package com.example.amst7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

public class Calendar extends AppCompatActivity {

    //se declaran las variables a ser utilizadas para mostrar datos del CalendarView
    long date;
    CalendarView cv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        //Se indica que objeto CalendarView de la interfaz se le añadira el listener
        cv = (CalendarView) findViewById(R.id.calendarView);
        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {

                //Se agrega un mensaje toast donde se muestra un mensaje de una tarea que tenga el usuario (dato quemado)
                date = cv.getDate();
                Toast.makeText(view.getContext(), "Date: " + year + "/" + month + "/" + dayOfMonth +
                        "\n" + "    TAREA #" + dayOfMonth, Toast.LENGTH_LONG).show();
            }
        });
    }


    //Metodo del boton VOLVER en donde se termina la Activity presente
    public void volver(View view){
        finish();
    }

}
