package info.lifeti.activeconnections11;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
    }

    public void logar(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaPrincipal.class);
        startActivity(it);
    }

    public void testeWs(View v) {
        final Context context = this;
        Intent it = new Intent(context, TesteWS.class);
        startActivity(it);
    }
}
