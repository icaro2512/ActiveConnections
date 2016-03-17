package info.lifeti.activeconnections11.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

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
    EditText etCEndCepNumero,etCEndRef,etCEndNmr,etCEndEndereco,etCEndComp,etCEndBairro,etCEndCidade,etCEndUf,etCEndPais;
    TextView tCEndId,tCEndNomeFantasia;
    Spinner sCEndStatus;
    Button bClientSalvar,bClientSair;
    Cliente CLIENTE;
    Integer STATUS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cliente_localizacao);

        STATUS = (Integer)getIntent().getSerializableExtra("STATUS");
        if (STATUS >= 1) {
            CLIENTE = (Cliente)getIntent().getSerializableExtra("CLIENTE");
        }

        //Importando EditText
        etCEndCepNumero = (EditText) findViewById(R.id.etCEndCepNumero);
        etCEndRef = (EditText) findViewById(R.id.etCEndRef);
        etCEndNmr = (EditText) findViewById(R.id.etCEndNmr);
        etCEndEndereco = (EditText) findViewById(R.id.etCEndEndereco);
        etCEndComp = (EditText) findViewById(R.id.etCEndComp);
        etCEndBairro = (EditText) findViewById(R.id.etCEndBairro);
        etCEndCidade = (EditText) findViewById(R.id.etCEndCidade);
        etCEndUf = (EditText) findViewById(R.id.etCEndUf);
        etCEndPais = (EditText) findViewById(R.id.etCEndPais);

        //Importando TextView
        tCEndId = (TextView) findViewById(R.id.tCEndId);
        tCEndNomeFantasia = (TextView) findViewById(R.id.tCEndNomeFantasia);
        //Importando Spinner
        sCEndStatus = (Spinner) findViewById(R.id.sCEndStatus);
        //Importando Button
        bClientSalvar = (Button) findViewById(R.id.bClientSalvar);
        bClientSair = (Button) findViewById(R.id.bClientSair);

    }
    public void salvarClientLocalizacao() {
        if (armazenarEndereco()) {
            Intent it = new Intent(this, TelaCliente.class);
            it.putExtra("STATUS",2);
            it.putExtra("STATUS",CLIENTE);
            finish();
        }



    }

    public Boolean armazenarEndereco() {
        CLIENTE.getJur().getPes().setpEnd(new PessoaEndereco());
        CLIENTE.getJur().getPes().getpEnd().setEnd(new Endereco());
        CLIENTE.getJur().getPes().getpEnd().getEnd().setCep(new Cep());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().setBai(new Bairro());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().getBai().setCid(new Cidade());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().getBai().getCid().setEst(new Estado());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().getBai().getCid().getEst().setPai(new Pais());

        return true;
    }

    public void closeEnde(View v) {

        Intent it = new Intent(this, TelaCliente.class);
        it.putExtra("STATUS", STATUS);
        startActivity(it);
        finish();
    }
}
