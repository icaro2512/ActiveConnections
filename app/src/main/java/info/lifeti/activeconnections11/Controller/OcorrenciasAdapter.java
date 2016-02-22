package info.lifeti.activeconnections11.Controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Dragon on 20/02/2016.
 */
public class OcorrenciasAdapter extends BaseAdapter {
    private String[] planetas = new String[] {"Mércurio","Vênus","Terra","Marte","Júpiter","Saturno",
            "Urano","Netuno","Plutão"};
    private Context context;
    public OcorrenciasAdapter(Context context) {
        super();
        this.context = context; // O context é necessário para criar a VIEW
    }


    @Override
    public int getCount() {
        return planetas.length; //Qtd de itens do Adapter
    }

    @Override
    public Object getItem(int position) {
        return planetas[position]; //Retorna o Objeto para esta posição
    }

    @Override
    public long getItemId(int position) {
        return position; //Retorna o id do objeto para esta posição
    }

    @Override
    //Retorna a VIEW para esta posição
    public View getView(int position, View convertView, ViewGroup parent) {
        String planeta = planetas[position];
        TextView t = new TextView(context);
        float dip = 50;
        float densidade = context.getResources().getDisplayMetrics().density; // Densidade da Tela

        int px = (int) (dip * densidade + 0.5f);
        t.setHeight(px);
        t.setText(planeta);
        return t;
    }
}
