package info.lifeti.activeconnections11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import info.lifeti.activeconnections11.Model.Usuario;

public class TesteWS extends AppCompatActivity {

    private static final String URL = "http://localhost:8080/JavaWebservice/pessoaResource/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_ws);

        /*
        if (Build.VERSION.SDK_INT >9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }*/


    }


}
