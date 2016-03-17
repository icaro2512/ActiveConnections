package info.lifeti.activeconnections11;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class JsonAddInfo extends AppCompatActivity {
    EditText eName, eEmail, eTelefone;
    String name, email, telefone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_add_info);
        eName = (EditText) findViewById(R.id.eName);
        eEmail = (EditText) findViewById(R.id.eEmail);
        eTelefone = (EditText) findViewById(R.id.eTelefone);
    }

    public void saveInfo(View view) {
        name = eName.getText().toString();
        email = eEmail.getText().toString();
        telefone = eTelefone.getText().toString();
        BackgroundTask backgroundTask = new BackgroundTask();
        backgroundTask.execute(name, email, telefone);
        finish();

    }

    class BackgroundTask extends AsyncTask<String, Void, String> {

        String add_info_url;

        @Override
        protected void onPreExecute() {

            add_info_url = "http://192.168.0.100/jsonTeste/add_info.php";
        }

        @Override
        protected String doInBackground(String... args) {
            String name, email, telefone;
            name = args[0];
            email = args[1];
            telefone = args[2];
            try {
                URL url = new URL(add_info_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String data_stirng = URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(name, "UTF-8") + "&" +
                        URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8") + "&" +
                        URLEncoder.encode("telefone", "UTF-8") + "=" + URLEncoder.encode(telefone, "UTF-8");
                bufferedWriter.write(data_stirng);
                bufferedWriter.flush();
                bufferedWriter.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                inputStream.close();
                httpURLConnection.disconnect();

                return "One Row of data inserted...";

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
            Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
        }


    }

}
