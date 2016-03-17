package info.lifeti.activeconnections11;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JsonTesteInsertView extends AppCompatActivity {
    Button bAddContact, bViewContact;
    TextView tJsonInsertView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_teste_insert_view);
        bAddContact = (Button) findViewById(R.id.bAddContact);
        bViewContact = (Button) findViewById(R.id.bViewContact);
        tJsonInsertView = (TextView) findViewById(R.id.tJsonInsertView);
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {
            tJsonInsertView.setVisibility(View.INVISIBLE);
        } else {
            bAddContact.setEnabled(false);
            bViewContact.setEnabled(false);
        }

    }


    public void addContact(View view) {
        startActivity(new Intent(this, JsonAddInfo.class));
    }
}
