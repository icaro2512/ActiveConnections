package info.lifeti.activeconnections11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;

public class JsonSpinnerVolley extends AppCompatActivity implements Spinner.OnItemSelectedListener {

    //Declaring an Spinner
    private Spinner sUsuarios;

    //An ArrayList for Spinner Items
    private ArrayList<String> usuarios;

    //JSON Array
    private JSONArray resultado;

    //TextViews to display details
    private TextView tId;
    private TextView tApelido;
    private TextView tLogin;
    private TextView tSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_spinner_volley);

        //Iniciando a ArrayList
        usuarios = new ArrayList<String>();

        //Iniciando o spinner
        sUsuarios = (Spinner) findViewById(R.id.sUsuarios);

        // Adicionando um item de escuta seleccionados para a nossa Spinner
        sUsuarios.setOnItemSelectedListener(this);

        tId = (TextView) findViewById(R.id.tId);
        tApelido = (TextView) findViewById(R.id.tApelido);
        tLogin = (TextView) findViewById(R.id.tLogin);
        tSenha = (TextView) findViewById(R.id.tSenha);

        // Este método irá buscar os dados a partir do URL
        getData();

    }

    public void deleteUsuario(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);


        final String url = "http://lifeti.netau.net/prospeccao/deleteUsuario.php?usuId=" + tId.getText();

        // prepare the Request
        JsonObjectRequest getRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // display response

                        try {
                            int success = response.getInt("success");

                            if (success == 1) {
                                Toast.makeText(getApplicationContext(), "Deletação efetuada com o sucesso.", Toast.LENGTH_SHORT).show();
                                Log.d("Response", response.toString());
                                finish();
                            } else {
                                Toast.makeText(getApplicationContext(), "Falha ao deletar.", Toast.LENGTH_SHORT).show();
                                Log.d("Response", response.toString());
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Error.Response", error.toString());
                    }
                }
        );

        // add it to the RequestQueue
        queue.add(getRequest);
    }

    private void getData() {
        //Creating a string request
        StringRequest stringRequest = new StringRequest(Config.DATA_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        JSONObject j = null;
                        try {
                            //Parsing the fetched Json String to JSON Object
                            j = new JSONObject(response);

                            //Storing the Array of JSON String to our JSON Array
                            resultado = j.getJSONArray(Config.JSON_ARRAY_USUARIOS);

                            //Calling method getStudents to get the students from the JSON Array
                            getUsuarios(resultado);
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

    private void getUsuarios(JSONArray j) {
        //Traversing through all the items in the json array
        for (int i = 0; i < j.length(); i++) {
            try {
                //Getting json object
                JSONObject json = j.getJSONObject(i);

                //Adding the name of the student to array list
                usuarios.add(json.getString(Config.TAG_USUAPELIDO));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        //Setting adapter to show the items in the spinner
        sUsuarios.setAdapter(new ArrayAdapter<String>(JsonSpinnerVolley.this, android.R.layout.simple_spinner_dropdown_item, usuarios));
    }


    //Method to get student name of a particular position
    private String getUsuarioApelido(int position) {
        String apelido = "";
        try {
            //Getting object of given index
            JSONObject json = resultado.getJSONObject(position);

            //Fetching name from that object
            apelido = json.getString(Config.TAG_USUAPELIDO);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Returning the name
        return apelido;
    }

    //Method to get student name of a particular position
    private String getUsuarioId(int position) {
        String id = "";
        try {
            //Getting object of given index
            JSONObject json = resultado.getJSONObject(position);

            //Fetching name from that object
            id = json.getString(Config.TAG_USUID);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Returning the name
        return id;
    }

    //Doing the same with this method as we did with getName()
    private String getUsuarioLogin(int position) {
        String login = "";
        try {
            JSONObject json = resultado.getJSONObject(position);
            login = json.getString(Config.TAG_USULOGIN);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return login;
    }

    //Doing the same with this method as we did with getName()
    private String getUsuarioSenha(int position) {
        String senha = "";
        try {
            JSONObject json = resultado.getJSONObject(position);
            senha = json.getString(Config.TAG_USUSENHA);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return senha;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        tId.setText(getUsuarioId(position));
        tApelido.setText(getUsuarioApelido(position));
        tLogin.setText(getUsuarioLogin(position));
        tSenha.setText(getUsuarioSenha(position));

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        tId.setText("");
        tApelido.setText("");
        tLogin.setText("");
        tSenha.setText("");

    }
}
