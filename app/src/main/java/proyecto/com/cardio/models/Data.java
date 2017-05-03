package proyecto.com.cardio.models;

import java.util.UUID;

/**
 * Created by root on 18/04/17.
 */

public class Data {
    private Integer id;
    private String title;
    private String text;
    private Integer image;
    private String idCapitulo;

    public Data(Integer id,String title, String text, Integer image, String idCapitulo) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.image = image;
        this.idCapitulo = idCapitulo;
    }

    public String getIdCapitulo() {
        return idCapitulo;
    }

    public void setIdCapitulo(String idCapitulo) {
        this.idCapitulo = idCapitulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
