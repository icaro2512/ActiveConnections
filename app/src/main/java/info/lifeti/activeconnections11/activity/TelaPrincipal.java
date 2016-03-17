package info.lifeti.activeconnections11.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import info.lifeti.activeconnections11.R;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        /*
        TextView text = (TextView) findViewById(R.id.tTeste);
        text.setText("Funcionou");
        yesjueue

        Super COMENTÁRIO TESTEk
        */
    }


    public void ocorrencias(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaOcorrencias.class);
        startActivity(it);
        finish();
    }

    public void cliente(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClientes.class);
        startActivity(it);
        finish();
    }
}
