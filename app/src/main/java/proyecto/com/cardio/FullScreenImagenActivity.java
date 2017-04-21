package proyecto.com.cardio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.chrisbanes.photoview.PhotoView;

public class FullScreenImagenActivity extends AppCompatActivity {

    String id;
    PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_imagen);
        photoView = (PhotoView) findViewById(R.id.fullscreenimagen);
        id = getIntent().getExtras().getString("idimagen");
        photoView.setImageResource(Integer.parseInt(id));
    }
}
