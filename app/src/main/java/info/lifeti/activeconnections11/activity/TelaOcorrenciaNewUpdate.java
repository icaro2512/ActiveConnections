package info.lifeti.activeconnections11.activity;


import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.TextView;


import android.widget.Toast;

import java.util.Calendar;

import info.lifeti.activeconnections11.R;


public class TelaOcorrenciaNewUpdate extends AppCompatActivity {
    Button btn,btn1;
    TextView dtInicial,dtFinal;
    int i;
    static final int DIALOG_ID = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_ocorrencia_new_update);


        showDialogOnButtonClick();
    }

    public void showDialogOnButtonClick() {
        btn = (Button)findViewById(R.id.bDtInicialOco);
        btn1 = (Button)findViewById(R.id.bDtFinalOco);
            btn.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            teste(v);
                            //showDialog(DIALOG_ID);
                            i = 0;
                        }
                    }
            );

            btn1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //showDialog(DIALOG_ID);
                            i = 1;
                        }
                    }
            );
    }

    private int year_x,month_x, day_x, hour_x, minute_x;


    public void teste(View view) {
        dateTimeInicial();
        Calendar cDefault = Calendar.getInstance();
        cDefault.set(year_x,month_x,day_x);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                dpickerListener,
                cDefault.get(Calendar.YEAR),
                cDefault.get(Calendar.MONTH),
                cDefault.get(Calendar.DAY_OF_MONTH)
        );

        datePickerDialog.setOnCancelListener(null);
        datePickerDialog.show();


    }

    private void dateTimeInicial() {
        if(year_x == 0) {
            Calendar c = Calendar.getInstance();
            year_x = c.get(Calendar.YEAR);
            month_x = c.get(Calendar.MONTH);
            day_x = c.get(Calendar.DAY_OF_MONTH);
            hour_x = c.get(Calendar.HOUR_OF_DAY);
            minute_x = c.get(Calendar.MINUTE);
        }

    }

    DatePickerDialog.OnDateSetListener dpickerListener
            = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            year_x = year;
            month_x = monthOfYear + 1;
            day_x = dayOfMonth;

        }
    };


    /*
    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_ID)
            return new DatePickerDialog(this,dpickerListener, year_x, month_x, day_x);
        return null;
    }*/


    /* PEGAR AQUI
    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_ID)
            return new TimePickerDialog(this,tpickerListener,hour_x,minute_x,true);
        return null;
    }



    private TimePickerDialog.OnTimeSetListener tpickerListener
            = new TimePickerDialog.OnTimeSetListener() {


        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            DatePickerDialog.OnDateSetListener dpickerListener
                    = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    year_x = year;
                    month_x = monthOfYear + 1;
                    day_x = dayOfMonth;

                }
            };

            hour_x = hourOfDay;
            minute_x = minute;


            if (i == 0) {
                dtInicial = (TextView) findViewById(R.id.tDtInicialOco);
                dtInicial.setText(day_x + " / " + month_x + " / " + year_x);
                //Toast.makeText(TelaOcorrenciaNewUpdate.this,, Toast.LENGTH_LONG).show();)=
            } else {
                dtFinal = (TextView) findViewById(R.id.tDtFinalOco);
                dtFinal.setText(day_x + " / " + month_x + " / " + year_x);
                //Toast.makeText(TelaOcorrenciaNewUpdate.this,year_x + " / " + month_x + " / "+ day_x, Toast.LENGTH_LONG).show();

            }
        }
    };
    ATÉ AQUI
    */

    /*DATEPICKERFRAGMENT
    private int year, month, day, hour, minute;

    public void showDatePickerDialog(View v) {
        DatePickerDialog datePickerDialog;
        DialogFragment newFragment = new DialogFragment();
        final Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);

        newFragment.show(getSupportFragmentManager(), "teste");
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        Toast.makeText(this, "Teste!", Toast.LENGTH_SHORT).show();

    }

*/

    /*
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getFragmentManager(), this, year, month, day);
    }*/


}
