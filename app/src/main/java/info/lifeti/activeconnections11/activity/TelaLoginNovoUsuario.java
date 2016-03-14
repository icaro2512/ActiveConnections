package info.lifeti.activeconnections11.activity;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import info.lifeti.activeconnections11.Model.Usuario;
import info.lifeti.activeconnections11.R;
import info.lifeti.activeconnections11.WS.addUsuario;

public class TelaLoginNovoUsuario extends AppCompatActivity {
    EditText eUsuApelido,eUsuLogin,eUsuSenha;
    Usuario usu;
    String apelido,login,senha;
    Context ctx;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login_novo_usuario);

        eUsuApelido = (EditText)findViewById(R.id.eUsuApelido);
        eUsuLogin = (EditText)findViewById(R.id.eUsuLogin);
        eUsuSenha = (EditText)findViewById(R.id.eUsuSenha);

        ctx = this;

    }

    public void addUsuario(View view)
    {
        usu = new Usuario();
        usu.setUsuApelido(eUsuApelido.getText().toString());
        usu.setUsuLogin(eUsuLogin.getText().toString());
        usu.setUsuSenha(eUsuSenha.getText().toString());

        addUsuario aUsuario = new addUsuario(ctx);
        aUsuario.execute(usu);
        finish();

    }

    public void voltar(View view)
    {
       finish();
    }



}
