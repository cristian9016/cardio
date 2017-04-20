package proyecto.com.cardio;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by root on 19/04/17.
 */

public class MyPagerAdapter extends CursorAdapter {


    public MyPagerAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.fragment_cap1,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView title = (TextView) view.findViewById(R.id.section_title);
        TextView text = (TextView) view.findViewById(R.id.section_text);
        //ImageView image = (ImageView) view.findViewById(R.id.section_image);
        String ti = cursor.getString(1);
        String te = cursor.getString(2);
        //int im = cursor.getInt(3);
        title.setText(ti);
        text.setText(te);

    }
}
