package info.lifeti.activeconnections11.activity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import info.lifeti.activeconnections11.R;
import info.lifeti.activeconnections11.adapter.OcorrenciasAdapter;

public class TelaOcorrencias extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_ocorrencias);

        //ListView
        listView = (ListView) findViewById(R.id.listaOcorrencias);
        listView.setAdapter(new OcorrenciasAdapter(this));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Objeto selecionado, que neste caso era de um array de strings
        String s = (String) parent.getAdapter().getItem(position);
        Toast.makeText(this, "Texto seleiconado: " + s + ", posição: "+ position, Toast.LENGTH_SHORT).show();
    }

    public void newUpdateOcorrencia(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaOcorrenciaNewUpdate.class);
        startActivity(it);
        finish();
    }
}
