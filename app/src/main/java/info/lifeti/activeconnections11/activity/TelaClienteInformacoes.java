package info.lifeti.activeconnections11.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import info.lifeti.activeconnections11.Model.Cidade;
import info.lifeti.activeconnections11.Model.Cliente;
import info.lifeti.activeconnections11.Model.Juridica;
import info.lifeti.activeconnections11.Model.Pessoa;
import info.lifeti.activeconnections11.R;

public class TelaClienteInformacoes extends AppCompatActivity {
    EditText jurNomeFantasia,jurRazaoSocial,jurCnpj,jurIE,jurIM,jurDataFund,cliRamo,jurIBGE,cliEnquad,cliObs;
    String addClienteURL = "http://lifeti.netau.net/prospeccao/addCliente.php";
    Cliente clt;
    Context cljp;
    Integer STATUS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cliente_informacoes);

        STATUS = (Integer)getIntent().getSerializableExtra("STATUS");

        jurNomeFantasia = (EditText) findViewById(R.id.tClientNome);
        jurRazaoSocial = (EditText) findViewById(R.id.tClientEmp);
        jurCnpj = (EditText) findViewById(R.id.tClientCnpj);
        jurIE = (EditText) findViewById(R.id.tClientIE);
        jurIM = (EditText) findViewById(R.id.tClientIM);
        jurDataFund = (EditText) findViewById(R.id.tClientDTFund);
        cliRamo = (EditText) findViewById(R.id.tClientRamo);
        jurIBGE = (EditText) findViewById(R.id.tClientCMIbge);
        cliEnquad = (EditText) findViewById(R.id.tClientEquad);
        cliObs = (EditText) findViewById(R.id.tClientObs);

        cljp = this;
    }

    public void salvarInfoCliente(View View)
    {
        clt = new Cliente();
        clt.setJur(new Juridica());
        clt.getJur().setPes(new Pessoa());
        clt.getJur().setCid(new Cidade());

        clt.getJur().setJurNomeFantasia(jurNomeFantasia.getText().toString());
        clt.getJur().setJurRazaoSocial(jurRazaoSocial.getText().toString());
        clt.getJur().setJurCnpj(jurCnpj.getText().toString());
        clt.getJur().setJurInscricaoEstadual(jurIE.getText().toString());
        clt.getJur().setJurInscricaoMunicipal(jurIM.getText().toString());
        clt.getJur().setJurDtFundacao(jurDataFund.getText().toString());
        clt.setCliRamo(cliRamo.getText().toString());
        clt.setCliEnquadramento(cliEnquad.getText().toString());
        clt.setCliObservacoes(cliObs.getText().toString());

        clt.getJur().getCid().setCidCodIbge(cliRamo.getText().toString());

        Intent it = new Intent(this, TelaCliente.class);
        it.putExtra("STATUS", 1);
        it.putExtra("CLIENTE", clt);
        startActivity(it);

        finish();
    }
    public void closeInfo(View v) {

        Intent it = new Intent(this, TelaCliente.class);
        it.putExtra("STATUS", STATUS);
        startActivity(it);
        finish();
    }
}
