package info.lifeti.activeconnections11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import info.lifeti.activeconnections11.Model.JsonContactsAdapter;

public class JsonDiplayListView extends AppCompatActivity {
    String json_string;
    JSONObject jsonObject;
    JSONArray jsonArray;
    JsonContactsAdapter contactsAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_diplay_list_view);
        listView = (ListView) findViewById(R.id.listView);
        contactsAdapter = new JsonContactsAdapter(this, R.layout.row_layout);
        listView.setAdapter(contactsAdapter);
        json_string = getIntent().getExtras().getString("json_data");
        try {
            jsonObject = new JSONObject(json_string);
            int count = 0;
            String name, email, telefone;
            while (count < jsonArray.length()) {
                JSONObject JO = jsonArray.getJSONObject(count);
                /* O JO.getString referencia o nome da variavel dada no arquivo php na seguinte linha como Ex:
                * array_push($response,array("nome"=>$row[0],"email"=>$row[1],"telefone"=>$row[2]));
                *
                */
                name = JO.getString("nome");
                email = JO.getString("email");
                telefone = JO.getString("telefone");
                JsonContacta contacts = new JsonContacta(name, email, telefone);
                contactsAdapter.add(contacts);

                count++;

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
