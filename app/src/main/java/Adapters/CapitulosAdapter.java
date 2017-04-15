package Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

import proyecto.com.cardio.R;


public class CapitulosAdapter extends BaseAdapter {

    private List<String> caps;
    private Context context;

    public CapitulosAdapter(Context context,List<String> caps){
        this.caps = caps;
        this.context = context;
    }

    @Override
    public int getCount() {
        return caps.size();
    }

    @Override
    public Object getItem(int position) {
        return caps.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null){
            v = View.inflate(context, R.layout.caplist,null);
        }
        String a = (String) getItem(position);
        TextView capitulos = (TextView) v.findViewById(R.id.caps);
        capitulos.setText(a);
        return v;
    }
}
