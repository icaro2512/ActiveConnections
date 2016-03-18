package info.lifeti.activeconnections11.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import info.lifeti.activeconnections11.Model.Cliente;
import info.lifeti.activeconnections11.R;

public class TelaCliente extends AppCompatActivity {
    Integer STATUS;
    Cliente CLIENTE;
    Button bClientEnd;
    Button bClientEmail;
    Button bClientTel;
    Button bClientCont;
    Button bClientInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cliente);

        STATUS = (Integer)getIntent().getSerializableExtra("STATUS");


        bClientInfo = (Button)findViewById(R.id.bClientInfo);
        bClientEnd = (Button)findViewById(R.id.bClientEnd);
        bClientEmail = (Button)findViewById(R.id.bClientEmail);
        bClientTel = (Button)findViewById(R.id.bClientTel);
        bClientCont = (Button)findViewById(R.id.bClientCont);

        if(STATUS == 0) {
            bClientEnd.setEnabled(false);
            bClientEmail.setEnabled(false);
            bClientTel.setEnabled(false);
            bClientCont.setEnabled(false);
            Toast.makeText(this," "+STATUS,Toast.LENGTH_LONG).show();
        }else if(STATUS == 1) {
            bClientEmail.setEnabled(false);
            bClientTel.setEnabled(false);
            bClientCont.setEnabled(false);
            CLIENTE = (Cliente)getIntent().getSerializableExtra("CLIENTE");
            Toast.makeText(this,"Nome do Cliente "+CLIENTE.getJur().getJurNomeFantasia(),Toast.LENGTH_LONG).show();

        }else if(STATUS == 2) {
            bClientTel.setEnabled(false);
            bClientCont.setEnabled(false);
            Toast.makeText(this," "+STATUS,Toast.LENGTH_LONG).show();
           // CLIENTE = (Cliente)getIntent().getSerializableExtra("CLIENTE");
        }



    }

    public void clientInfos(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClienteInformacoes.class);
        it.putExtra("STATUS", STATUS);
        startActivity(it);
    }

    public void clientEnde(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClienteLocalizacao.class);
        it.putExtra("STATUS", STATUS);
        it.putExtra("CLIENTE", CLIENTE);
        startActivity(it);
    }

    public void clientEmail(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClienteEmail.class);
        it.putExtra("STATUS", STATUS);
        startActivity(it);
    }

    public void clientTel(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClienteTelefone.class);
        it.putExtra("STATUS", STATUS);
        startActivity(it);
    }

    public void clientCont(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClienteContato.class);
        it.putExtra("STATUS", STATUS);
        startActivity(it);
    }

    public void backToClients(View v) {
        Intent it = new Intent(this, TelaClientes.class);
        startActivity(it);
        finish();
    }
}
