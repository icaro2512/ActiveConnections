package info.lifeti.activeconnections11.activity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import info.lifeti.activeconnections11.AsyncPHP;
import info.lifeti.activeconnections11.JsonSpinnerVolley;
import info.lifeti.activeconnections11.JsonTesteLista;
import info.lifeti.activeconnections11.R;
import info.lifeti.activeconnections11.TestePHP;
import info.lifeti.activeconnections11.TesteWS;

public class TelaLogin extends AppCompatActivity {
    Button bEntrar,bNovo;
    TextView tStatusWS;
    EditText ET_NAME,ET_PASS;
    String login_name,login_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        bEntrar = (Button)findViewById(R.id.bEntrar);
        bNovo = (Button)findViewById(R.id.bNovo);

        tStatusWS = (TextView)findViewById(R.id.tStatusWS);

        ET_NAME = (EditText)findViewById(R.id.eUsuario);
        ET_PASS = (EditText)findViewById(R.id.eSenha);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo!=null && networkInfo.isConnected())
        {
            tStatusWS.setVisibility(View.INVISIBLE);

        }
        else
        {
            bEntrar.setEnabled(false);
            bNovo.setEnabled(false);
        }

    }

    public void logar(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaPrincipal.class);
        startActivity(it);
        finish();
    }

    public void testeWs(View v) {
        final Context context = this;
        Intent it = new Intent(context, TesteWS.class);
        startActivity(it);
    }

    public void testePHP(View v) {
        final Context context = this;
        Intent it = new Intent(context, TestePHP.class);
        startActivity(it);
    }

    public void testeJSON(View v) {
        final Context context = this;
        Intent it = new Intent(context, JsonTesteLista.class);
        startActivity(it);
    }

    public void testeJSONVolley(View v) {
        final Context context = this;
        Intent it = new Intent(context, JsonSpinnerVolley.class);
        startActivity(it);
    }

    public void addUsuario(View view) {
        startActivity(new Intent(this,TelaLoginNovoUsuario.class));
    }

    public void login(View view) {
        login_name = ET_NAME.getText().toString();
        login_pass = ET_PASS.getText().toString();
        String method = "login";
        AsyncPHP bgTask = new AsyncPHP(this);
        bgTask.execute(method,login_name,login_pass);
        //startActivity(new Intent(this,TestePHP.class));
    }

    public void lista(View view) {
        String method = "lista";
        AsyncPHP bgTask = new AsyncPHP(this);
        bgTask.execute(method);
        //startActivity(new Intent(this,TestePHP.class));
    }

}
