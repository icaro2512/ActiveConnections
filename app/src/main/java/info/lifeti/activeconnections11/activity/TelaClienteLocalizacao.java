package info.lifeti.activeconnections11.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import info.lifeti.activeconnections11.Config;
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
import info.lifeti.activeconnections11.WS.buscarCep;

public class TelaClienteLocalizacao extends AppCompatActivity {
    EditText etCEndCepNumero,etCEndRef,etCEndNmr,etCEndEndereco,etCEndComp,etCEndBairro,etCEndCidade,etCEndUf,etCEndPais;
    TextView tCEndId,tCEndNomeFantasia;
    Spinner sCEndStatus;
    Button bClientSalvar,bClientSair;
    Cliente CLIENTE;
    Integer STATUS;
    //JSON Array
    JSONArray resultadoJSON;

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

        /*CLIENTE.getJur().getPes().setpEnd(new PessoaEndereco());
        CLIENTE.getJur().getPes().getpEnd().setEnd(new Endereco());
        CLIENTE.getJur().getPes().getpEnd().getEnd().setCep(new Cep());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().setBai(new Bairro());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().getBai().setCid(new Cidade());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().getBai().getCid().setEst(new Estado());
        CLIENTE.getJur().getPes().getpEnd().getEnd().getCep().getBai().getCid().getEst().setPai(new Pais());
        */
        return true;
    }

    public void closeEnde(View v) {

        Intent it = new Intent(this, TelaCliente.class);
        it.putExtra("STATUS", STATUS);
        startActivity(it);
        finish();
    }

    public void clickBuscarCep(View view) {
        if (etCEndCepNumero.getText().toString().equals("") || etCEndCepNumero.getText() == null) {
            Toast.makeText(getApplicationContext(), "É necessário preencher o CEP.", Toast.LENGTH_SHORT).show();
        } else {
            buscarCep(etCEndCepNumero.getText().toString());
        }

    }

    private void carregaJSONtoAndroidCep() throws JSONException {
        JSONObject jsonObject = resultadoJSON.getJSONObject(0);
        //JSON Strings
        String cepId = "cepId";
        String cepNumero = "cepNumero";
        String cepEndereco = "cepEndereco";
        String cepComplemento = "cepComplemento";
        String cepLogradouro = "cepLogradouro";
        String baiId = "baiId";
        String baiNome = "baiNome";
        String baiAbrev = "baiAbrev";
        String cidId = "cidId";
        String cidNome = "cidNome";
        String estId = "estId";
        String estNome = "estNome";
        String estUf = "estUf";
        String paiId = "paiId";
        String paiNome = "paiNome";
        String paiSigla = "paiSigla";
        //Criando PessoaEndereco e seus Construtores
        PessoaEndereco pessoaEndereco = new PessoaEndereco();
        pessoaEndereco.setEnd(new Endereco());
        pessoaEndereco.getEnd().setCep(new Cep());
        pessoaEndereco.getEnd().getCep().setBai(new Bairro());
        pessoaEndereco.getEnd().getCep().getBai().setCid(new Cidade());
        pessoaEndereco.getEnd().getCep().getBai().getCid().setEst(new Estado());
        pessoaEndereco.getEnd().getCep().getBai().getCid().getEst().setPai(new Pais());
        //Armazenando dados no pessoaEndereco através do Web Service
        /* Dados do Model Cep */
        pessoaEndereco.getEnd().getCep().setCepId(jsonObject.getInt(cepId));
        pessoaEndereco.getEnd().getCep().setCepNumero(jsonObject.getString(cepNumero));
        pessoaEndereco.getEnd().getCep().setCepEndereco(jsonObject.getString(cepEndereco));
        pessoaEndereco.getEnd().getCep().setCepComplemento(jsonObject.getString(cepComplemento));
        pessoaEndereco.getEnd().getCep().setCepLogradouro(jsonObject.getString(cepLogradouro));
        /* Dados do Model Bairro */
        pessoaEndereco.getEnd().getCep().getBai().setBaiId(jsonObject.getInt(baiId));
        pessoaEndereco.getEnd().getCep().getBai().setBaiNome(jsonObject.getString(baiNome));
        pessoaEndereco.getEnd().getCep().getBai().setBaiAbrev(jsonObject.getString(baiAbrev));
        /* Dados do Model Cidade */
        pessoaEndereco.getEnd().getCep().getBai().getCid().setCidId(jsonObject.getInt(cidId));
        pessoaEndereco.getEnd().getCep().getBai().getCid().setCidNome(jsonObject.getString(cidNome));
        /* Dados do Model UF */
        pessoaEndereco.getEnd().getCep().getBai().getCid().getEst().setEstId(jsonObject.getInt(estId));
        pessoaEndereco.getEnd().getCep().getBai().getCid().getEst().setEstNome(jsonObject.getString(estNome));
        pessoaEndereco.getEnd().getCep().getBai().getCid().getEst().setEstUf(jsonObject.getString(estUf));
        /* Dados do Model Pais */
        pessoaEndereco.getEnd().getCep().getBai().getCid().getEst().getPai().setPaiId(jsonObject.getInt(paiId));
        pessoaEndereco.getEnd().getCep().getBai().getCid().getEst().getPai().setPaiNome(jsonObject.getString(paiNome));
        pessoaEndereco.getEnd().getCep().getBai().getCid().getEst().getPai().setPaiSigla(jsonObject.getString(paiSigla));

        preencheEditText(pessoaEndereco);
        Toast.makeText(getApplicationContext(), "Cep ID:" + pessoaEndereco.getEnd().getCep().getCepId(), Toast.LENGTH_SHORT).show();
    }

    public void preencheEditText(PessoaEndereco pE) {
        //etCEndCepNumero = (EditText) findViewById(R.id.etCEndCepNumero);
        //etCEndRef = (EditText) findViewById(R.id.etCEndRef);
        //etCEndNmr = (EditText) findViewById(R.id.etCEndNmr);
        etCEndEndereco.setText(pE.getEnd().getCep().getCepEndereco());
        etCEndComp.setText(pE.getEnd().getCep().getCepComplemento());
        etCEndBairro.setText(pE.getEnd().getCep().getBai().getBaiNome());
        etCEndCidade.setText(pE.getEnd().getCep().getBai().getCid().getCidNome());
        etCEndUf.setText(pE.getEnd().getCep().getBai().getCid().getEst().getEstNome());
        etCEndPais.setText(pE.getEnd().getCep().getBai().getCid().getEst().getPai().getPaiNome());
    }


    private void buscarCep(String cep) {
        //JSON URL
        String url = "http://lifeti.netau.net/prospeccao/buscarCep.php?cepNumero="+cep;
        //JSON nome da Array
        final String arrayCep = "Cep";
        //Criando a String de requisição
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        JSONObject j = null;
                        try {
                            j = new JSONObject(response);

                            //Guardando a Array do JSON String para a JSON Array no Android
                            resultadoJSON = j.getJSONArray(arrayCep);
                            carregaJSONtoAndroidCep();


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        //Creating a request queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        //Adding request to the queue
        requestQueue.add(stringRequest);

    }


}


