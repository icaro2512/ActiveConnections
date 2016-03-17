package info.lifeti.activeconnections11;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class JsonTesteLista extends Activity {
    Button b1;
    TextView tListarUsuarios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_teste_lista);


    }

    /*
    public void getJSON(View view) {
        new BackgroundTask().execute();

    }


    class BackgroundTask extends AsyncTask<Void,Void,String> {

        String json_url;


        @Override
        protected void onPreExecute() {
            json_url = "http://lifeti.netau.net/prospeccao/mostrarUsuario.php";
        }

        @Override
        protected String doInBackground(Void... params) {

            try {
                URL url = new URL(json_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder = new StringBuilder();
                while((JSON_STRING = bufferedReader.readLine()) != null) {
                    stringBuilder.append(JSON_STRING+"\n");

                }

                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return stringBuilder.toString().trim();

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
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(result);
            json_string = result;
        }
    }

    public void parseJSON(View view) {


        if (json_string==null) {
            Toast.makeText(getApplicationContext(),"First Get JSON",Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(this,JsonDiplayListView.class);
            intent.putExtra("json_data",json_string);
            startActivity(intent);
        }

    }*/

}
