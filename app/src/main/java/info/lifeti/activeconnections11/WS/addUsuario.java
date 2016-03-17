package info.lifeti.activeconnections11.WS;

import android.content.Context;
import android.os.AsyncTask;
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


public class addUsuario extends AsyncTask<Usuario,Void,String> {
    String addUsuarioURL;
    Context ctx;

    public addUsuario(Context ctx)
    {
        this.ctx = ctx;
    }

    @Override
    protected void onPreExecute() {
        addUsuarioURL = "http://lifeti.netau.net/prospeccao/addUsuario.php";
    }

    @Override
    protected String doInBackground(Usuario... args) {
        String usuApelido,usuLogin,usuSenha;
        usuApelido = args[0].getUsuApelido();
        usuLogin = args[0].getUsuLogin();
        usuSenha = args[0].getUsuSenha();


        try {
            URL url = new URL(addUsuarioURL);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            OutputStream OS = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(OS,"UTF-8"));
            String data_string = URLEncoder.encode("usuApelido", "UTF-8")+"="+URLEncoder.encode(usuApelido,"UTF-8")+"&"+
                    URLEncoder.encode("usuLogin","UTF-8")+"="+URLEncoder.encode(usuLogin,"UTF-8")+"&"+
                    URLEncoder.encode("usuSenha","UTF-8")+"="+URLEncoder.encode(usuSenha, "UTF-8");
            bufferedWriter.write(data_string);
            bufferedWriter.flush();
            bufferedWriter.close();
            OS.close();
            InputStream inputStream = httpURLConnection.getInputStream();
            inputStream.close();
            httpURLConnection.disconnect();
            return "Usuário adicionado com sucesso";

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(ctx, result, Toast.LENGTH_LONG).show();
    }
}