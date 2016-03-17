package info.lifeti.activeconnections11.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import info.lifeti.activeconnections11.R;

public class TelaClientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_clientes);
    }

    public void clientAdd(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaCliente.class);
        it.putExtra("STATUS",0);
        startActivity(it);
        finish();
    }

    public void backToLogin(View v) {// tirei pq tem botão de voltar no android ja
        finish();
    }
}
