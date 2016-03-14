package info.lifeti.activeconnections11.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import info.lifeti.activeconnections11.JsonContacta;
import info.lifeti.activeconnections11.R;


public class JsonContactsAdapter extends ArrayAdapter {
    List list = new ArrayList();

    public JsonContactsAdapter(Context context, int resource) {
        super(context, resource);
    }


    public void add(JsonContacta object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;
        ContactHolder contactHolder;
        if (row == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.row_layout,parent,false);
            contactHolder = new ContactHolder();
            contactHolder.tx_name = (TextView) row.findViewById(R.id.tx_name);
            contactHolder.tx_email = (TextView) row.findViewById(R.id.tx_email);
            contactHolder.tx_telefone = (TextView) row.findViewById(R.id.tx_telefone);
            row.setTag(contactHolder);
        }
        else {
            contactHolder = (ContactHolder) row.getTag();

        }

        JsonContacta contacts = (JsonContacta) this.getItem(position);
        contactHolder.tx_name.setText(contacts.getName());
        contactHolder.tx_email.setText(contacts.getEmail());
        contactHolder.tx_telefone.setText(contacts.getTelefone());
        return row;
    }

    static class ContactHolder {
        TextView tx_name,tx_email,tx_telefone;

    }

}
