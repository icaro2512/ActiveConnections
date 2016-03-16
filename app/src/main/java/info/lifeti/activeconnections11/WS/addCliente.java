package info.lifeti.activeconnections11.WS;

import android.content.Context;
import android.os.AsyncTask;

import info.lifeti.activeconnections11.Model.Cliente;

/**
 * Created by Administrador on 15/03/2016.
 */
public class addCliente extends AsyncTask<Cliente,Void,String> {
    String url;
    Context ctx;


    public addCliente(Context ctx)
    {
        this.ctx = ctx;
    }

    @Override
    protected void onPreExecute() {
        url = "http://lifeti.netau.net/prospeccao/addCliente.php";
    }

    @Override
    protected String doInBackground(Cliente... params) {
        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
