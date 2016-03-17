package info.lifeti.activeconnections11.activity;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

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
    EditText eUsuApelido, eUsuLogin, eUsuSenha;
    Button bAdicionarUsuario;
    TextView resultado;
    Usuario usu;
    Context ctx;
    RequestQueue requestQueue;
    String addUsuarioURL = "http://lifeti.netau.net/prospeccao/addUsuario.php";
    String listarUsuarioURL = "http://lifeti.netau.net/prospeccao/mostrarUsuario.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login_novo_usuario);

        eUsuApelido = (EditText) findViewById(R.id.eUsuApelido);
        eUsuLogin = (EditText) findViewById(R.id.eUsuLogin);
        eUsuSenha = (EditText) findViewById(R.id.eUsuSenha);

       
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


    public void voltar(View view) {
        finish();
    }

}
