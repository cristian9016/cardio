package proyecto.com.cardio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import static proyecto.com.cardio.Main2Activity.PlaceholderFragment.idCapitulo;

/**
 * Created by root on 18/04/17.
 */

public class DataDbHelper extends SQLiteOpenHelper {
    public static final int DATA_BASE_VERSION = 1;
    public static final String DATA_BASE_NAME = "Data.db";

    public DataDbHelper(Context context){
        super(context,DATA_BASE_NAME,null,DATA_BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ DataContract.DataEntry.tableName+ " ("
                + DataContract.DataEntry.ID + " INTEGER PRIMARY KEY,"
                + DataContract.DataEntry.TITLE + " TEXT NOT NULL,"
                + DataContract.DataEntry.TEXT + " TEXT NOT NULL,"
                + DataContract.DataEntry.IMAGE + " INTEGER NOT NULL,"
                + DataContract.DataEntry.IDCHAPTER + " TEXT NOT NULL"
                + ")"
        );


        insertarData(db);

    }

    private void insertarData(SQLiteDatabase db){

        insertar(db, new Data(1,"Anatomia del Corazon","El corazon es un organo muscular del tamaño de un puño que se localiza en el mediastino y constituye la" +
                " estructura central del sistema cardiovascular. Esta protegido en el plano anterior por el esternon y en" +
                " el posterior por la columna vertebral y la caja torácica. Es mas o menos conico; su base esta ubicada en" +
                " la parte superior y el apex (la punta) en la inferior. Se encuentraligeramente rotado en sentido inverson" +
                " a las manecillas del reloj, con el apex orientado hacia delante, de manera que la superficie posterior descansa" +
                " sobre el diafragma",R.drawable.localizaciondelcorazon,""+R.id.botonCapitulo1));
        insertar(db, new Data(2,"Capas del Corazon","El corazon se compone de diversas capas de tejido. Al rededor de este organo se encuentra un saco" +
                " protector de doble pared llamado pericardio, que tiene una capa interna sersosa (visceral)" +
                " y otra externa fibrosa (parietal). Entre ambas capas se localiza la cavidad pericardia," +
                " que contiene una pequeña cantidad de liquido lubricante cuya funcion es evitar la friccion durante" +
                " la contraccion cardiaca. las capas de la pared cardiaca incluyen el epicardio o capa externa; el miocardio," +
                " que es la gruesa capa media del musculo cardiaco, y el endocardio, una capa lisa de tejido conectivo" +
                " que recubre el interior del corazon",R.drawable.capasdelcorazon,""+R.id.botonCapitulo2));
        insertar(db,new Data(3,"Seccion anterior del corazon","mucho texto por aqui",R.drawable.seccionanteriordelcorazon,""+R.id.botonCapitulo1));
        insertar(db,new Data(4,"Colocacion de Electrodos","mucho texto por aqui",R.drawable.colocaciondeelectrodos,""+R.id.botonCapitulo2));

    }
    private void insertar(SQLiteDatabase sqLiteDatabase,Data data){
        ContentValues values = new ContentValues();
        values.put(DataContract.DataEntry.ID, data.getId());
        values.put(DataContract.DataEntry.TITLE, data.getTitle());
        values.put(DataContract.DataEntry.TEXT, data.getText());
        values.put(DataContract.DataEntry.IMAGE, data.getImage());
        values.put(DataContract.DataEntry.IDCHAPTER,data.getIdCapitulo());
        sqLiteDatabase.insertOrThrow(DataContract.DataEntry.tableName,null,values);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public List<Data> cargarLista(SQLiteDatabase db){
        List<Data> lista = new ArrayList<>();
        Cursor cursor = db.rawQuery("SELECT * FROM "+ DataContract.DataEntry.tableName+" WHERE "+ DataContract.DataEntry.IDCHAPTER +" = '"+idCapitulo+"'",null);
        while(cursor.moveToNext()){
            Data data = new Data(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getInt(3),cursor.getString(4));
            lista.add(data);
        }
        return lista;

    }

}
