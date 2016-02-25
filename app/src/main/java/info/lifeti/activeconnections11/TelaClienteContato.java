package info.lifeti.activeconnections11;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaClienteContato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cliente_contato);
    }

    public void contatoEdit(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClienteContatoTelEmail.class);
        startActivity(it);
    }

    public void closeClientCont(View v) {
        finish();
    }
}
