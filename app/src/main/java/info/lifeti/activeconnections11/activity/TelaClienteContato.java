package info.lifeti.activeconnections11.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import info.lifeti.activeconnections11.R;

public class TelaClienteContato extends AppCompatActivity {

    Integer STATUS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cliente_contato);

        STATUS = (Integer)getIntent().getSerializableExtra("STATUS");
    }

    public void contatoEdit(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClienteContatoTelEmail.class);
        startActivity(it);
    }

    public void closeClientCont(View v) {

        Intent it = new Intent(this, TelaCliente.class);
        it.putExtra("STATUS", STATUS);
        startActivity(it);
        finish();
    }
}
