package proyecto.com.cardio;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by root on 20/04/17.
 */

public class GridAdapter extends BaseAdapter {

    Context context;
    List<ImagenesData> data;

    public GridAdapter(Context context, List<ImagenesData> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null){
            v = View.inflate(context,R.layout.imagelayout,null);
        }

        final ImagenesData imagenesData = (ImagenesData) getItem(position);
//        int imagenId = imagenesData.getId();
        ImageView image = (ImageView) v.findViewById(R.id.imageGridviewLayout);
        Glide.with(context).load(imagenesData.getId()).into(image);
//        image.setImageResource(imagenId);
        return v;
    }

}
