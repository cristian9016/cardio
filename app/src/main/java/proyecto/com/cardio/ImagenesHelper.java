package proyecto.com.cardio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 20/04/17.
 */

public class ImagenesHelper {

    public ImagenesHelper() {
    }

    public List<ImagenesData> cargarImagenes(){
        List<ImagenesData> list = new ArrayList<>();
        ImagenesData imagenesData = new ImagenesData(R.drawable.colocaciondeelectrodos);
        list.add(imagenesData);
        imagenesData = new ImagenesData(R.drawable.capasdelcorazon);
        list.add(imagenesData);
        imagenesData = new ImagenesData(R.drawable.localizaciondelcorazon);
        list.add(imagenesData);
        imagenesData = new ImagenesData(R.drawable.seccionanteriordelcorazon);
        list.add(imagenesData);
        imagenesData = new ImagenesData(R.drawable.vistasuperiorsinlasauriculas);
        list.add(imagenesData);
        imagenesData = new ImagenesData(R.drawable.cardio);
        list.add(imagenesData);
        return list;
    }

}
