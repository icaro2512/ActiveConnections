package info.lifeti.activeconnections11;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TesteWS extends AppCompatActivity {

    private static final String URL = "http://localhost:8080/JavaWebservice/pessoaResource/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_ws);
    }

    private class HttpAsyncPOST {

    }
}
