package info.lifeti.activeconnections11.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import info.lifeti.activeconnections11.Model.Bairro;
import info.lifeti.activeconnections11.Model.Cep;
import info.lifeti.activeconnections11.Model.Cidade;
import info.lifeti.activeconnections11.Model.Cliente;
import info.lifeti.activeconnections11.Model.Endereco;
import info.lifeti.activeconnections11.Model.Estado;
import info.lifeti.activeconnections11.Model.Pais;
import info.lifeti.activeconnections11.Model.Pessoa;
import info.lifeti.activeconnections11.Model.PessoaEndereco;
import info.lifeti.activeconnections11.R;

public class TelaClienteLocalizacao extends AppCompatActivity {
    EditText cepnmr,cepEnd;
    Cliente CLIENTE;
    Integer STATUS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cliente_localizacao);

        STATUS = (Integer)getIntent().getSerializableExtra("STATUS");
        CLIENTE = (Cliente)getIntent().getSerializableExtra("CLIENTE");

        cepnmr = (EditText) findViewById(R.id.tCEndCep);
        cepEnd = (EditText) findViewById(R.id.etCEndRua);
    }
    public void salvarClientLocalizacao() {
        CLIENTE.getJur().getPes().setpEnd(new PessoaEndereco());
        CLIENTE.getJur().getPes().getpEnd().setEnd(new Endereco());
        CLIENTE.getJur().getPes().getpEnd().getEnd().setCep(new Cep());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().setBai(new Bairro());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().getBai().setCid(new Cidade());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().getBai().getCid().setEst(new Estado());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().getBai().getCid().getEst().setPai(new Pais());

        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().setCepNumero(cepnmr.getText().toString());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().setCepEndereco(cepEnd.getText().toString());

        //pEnd.getEnd().getCep().getBai().setBaiNome();

        Intent it = new Intent(this, TelaCliente.class);
        it.putExtra("STATUS",2);
        it.putExtra("STATUS",CLIENTE);
        finish();

    }
    public void closeEnde(View v) {

        Intent it = new Intent(this, TelaCliente.class);
        it.putExtra("STATUS", STATUS);
        startActivity(it);
        finish();
    }
}
