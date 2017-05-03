package proyecto.com.cardio.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import proyecto.com.cardio.R;
import proyecto.com.cardio.database.DataContract;
import proyecto.com.cardio.models.Data;

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

        insertar(db,new Data(1,"Anatomia del Corazon","El corazon es un organo muscular del tamaño de un puño que se localiza en el mediastino y constituye la estructura central del sistema cardiovascular. Esta protegido en el plano anterior por el esternon y en  el posterior por la columna vertebral y la caja torácica. Es mas o menos conico; su base esta ubicada en la parte superior y el apex (la punta) en la inferior. Se encuentraligeramente rotado en sentido inverson a las manecillas del reloj, con el apex orientado hacia delante, de manera que la superficie posterior descansa sobre el diafragma", R.drawable.localizaciondelcorazon,""+R.id.botonCapitulo1));
        insertar(db,new Data(2,"Capas del Corazon","El corazon se compone de diversas capas de tejido. Al rededor de este organo se encuentra un saco protector de doble pared llamado pericardio, que tiene una capa interna sersosa (visceral) y otra externa fibrosa (parietal). Entre ambas capas se localiza la cavidad pericardia, que contiene una pequeña cantidad de liquido lubricante cuya funcion es evitar la friccion durante la contraccion cardiaca. las capas de la pared cardiaca incluyen el epicardio o capa externa; el miocardio, que es la gruesa capa media del musculo cardiaco, y el endocardio, una capa lisa de tejido conectivo que recubre el interior del corazon.",R.drawable.capasdelcorazon,""+R.id.botonCapitulo1));
        insertar(db,new Data(3,"Valvulas Cardiacas","Propiedades de las valvulas cardiacas: \n - El tejido conectivo fibroso evita el agrandamiento de los orificios valvulares y fija las valvulas \n - El cierre de las vaulvulas evita el reflujo de la sangre durante y despues de la contracción",R.drawable.vistasuperiorsinlasauriculas,""+R.id.botonCapitulo1));
        insertar(db,new Data(4,"Cavidades cardiacas y grandes vasos","El corazon es un musculo hueco con un esqueleto interno de tejido conectivo que crea cuatro cavidades separadas.\n - Las cavidades superioresson las auriculas derecha e izquierda, cuya funcion principal es recolectar sangre conforme ésta entra en el corazon y ayduar al llenado de las cavidades inferiores. Éstas, que tienen una constitucion muscular mas gruesa, reciben el nombre de ventriculos; son las cavidades primarias de bombeo y de ellas la izquierda tiene una capa miocardica mas gruesa que la derecha.",R.drawable.seccionanteriordelcorazon,""+R.id.botonCapitulo1));
        insertar(db,new Data(5,"Arteria y venas coronarias","Las arterias y las venas coronarias proveen sangre al musculo cardiaco y al sistema de conduccion electrico. Las arterias coronarias derecha e izquierda son las primeras que surgen de la aorta, justo por arriba de las valvas de la valcula aortica",R.drawable.vistaanterioryposterior,""+R.id.botonCapitulo1));
        insertar(db,new Data(6,"Anatomia del sistema cardiovascular","El sistema cardiovascular es cerrado y esta constituido por el corazon y todos los vasos sanguineos. Las arterias y venas estan conectadas por estructuras pequeñas que transportan sustancias necesarias para el metabolismo celular d elos diferentes sistemas corporales y remueve los productos de desechos del metabolismo de estos tejidos. Las arterias transportan sangre lejos del corazon y, con excepcion de los pulmonares, transportan sangre oxigenada. Las venas transportan sangre hacia el corazon; con la excepcion de las pulmonares, llevan sangre baja en oxigeno y alta en dioxido de carbono.",R.drawable.cortecruzadodelosvasossanguineos,""+R.id.botonCapitulo1));
        insertar(db,new Data(7,"Principales arterias del sistema cardiovascular","",R.drawable.principalesarteriasdelsistemacardiovascular,""+R.id.botonCapitulo1));
        insertar(db,new Data(8,"Principales venas del sistema cardiovascular","",R.drawable.principalesvenasdelsistemascardiovascular,""+R.id.botonCapitulo1));
        insertar(db,new Data(9,"Fisiologia del corazon","El flujo normal de la sangre empieza en la auricula derecha, la cual recibe sangre venosa sistematica de las venas cavas superior e inferior. La sangre pasa de la auricula derecha hacia el ventriculo derecho a traves de la valvula tricuspide. Entonces se bombea a las arterias pulmonares a traves de la valvula pulmonar. \n Fuera del corazon, las arterias pulmonares izquierda y derecha distribuyen sangre a los pulmones para que se lleve a cabo el intercambio gaseoso en los capilares pulmonares. La sangre oxigenada regresa a la auricula izquierda a traves de las venas pulmonares izquierda y derecha. Despues de pasar por la valvula mitral, la sangre entra en el ventriculo izquierdo, donde es bombeada hacia las arterias coronarias y la circulacion periferica a traves de la valvula aortica y la arteria aorta.",R.drawable.cardio,""+R.id.botonCapitulo1));
        insertar(db,new Data(10,"Fases sistolica y Diastolica del corazon","",R.drawable.fasessistolicaydiastolicadelcorazon,""+R.id.botonCapitulo1));
        insertar(db,new Data(11,"Sistema de conduccion electrica del corazon","",R.drawable.sistemadeconducciondelcorazon,""+R.id.botonCapitulo1));
        insertar(db,new Data(12,"El proceso de despolarizacion","",R.drawable.elprocesodedespolarizacion,""+R.id.botonCapitulo1));
        insertar(db,new Data(13,"Progresion de la despolarizacion a traves del corazon","",R.drawable.progresiondeladespolarizacionatravesdelcorazon,""+R.id.botonCapitulo1));
        insertar(db,new Data(14,"Correlacion de la despolarizacion y repolarizacion con el electrocardiograma","Informacion Clinica: El equilibrio electrolitico - cuyos componentes importantes son calcio, sodio, potasio y magnesio - influyen en las funciones mecanicas y electricas del corazon.",R.drawable.correlaciondeladespolarizacionyrepolarizacionconelelectrocardiograma,""+R.id.botonCapitulo1));
        insertar(db,new Data(15,"El Electrocardiograma (ECG)","El organismo actua como un conductor gigante de corriente electrica. La actividad electrica que se origina en el corazon puede detectarse en la superficie del cuerpo mediante un electrocardiograma (ECG), para lo cual se fijan en la piel electrodos que miden el cambio de voltaje en las celulas ubicadas entre ellos. Dichos cambios se aplican y exponen visualmente en un osciloscopio y papel para graficar. \n - El ECG esta constituido por una serie de ondas y deflexiones que registran la actividad electrica del corazon en una cierta \"vista\" \n - Muchas de estas vistas - llamadas derivaciones - reproducen los cambios de voltaje que ocurren entre los electrodos colocados en diferentes partes del cuerpo. \n - Las derivaciones I, II y III son bipolares y constan de 2 electrodos de polaridad opuesta (positivo y negativo). El tercer electrodo (que se conecta a tierra) minimiza la actividad electrica de otras fuentes. \n - Las derivaciones aVR, aVL y aVF son unipolares y constan de un unico electrodo positivo y un punto de referencia (con potencial electrico igual a cero). Este yace en el centro del campo electrico del corazon. \n - Las derivaciones v1 a v6 son unipolares y constan de un solo electrodo positivo con un punto de referencia negativo que se localiza en el centro electrico del corazon. \n - El trazo de ECG cambia en cada derivacion porque el angulo de la actividad electrica registrado en cada una de ellas es diferente. La diversidad de angulos permite obtener una perspectiva mas exacta que uno solo. \n - el aparato ECG puede ajustarse para que cualquier electrodo colocado en la piel sea positivo o negativo. La polaridad depende de cual derivacion sea registrada por el aparato. \n - Un cable aderido al paciente se divide en varios alambres de coloracion diferente: 3, 4 o 5 para propositos de vigilancia o 10 para un ECG de 12 derivaciones. \n - La colocacion incorrecta de los electrodos puede transformar un ECG normal en uno anormal - \n - Informacion clinica: es importante tener en mente que el ECG solo muestra actividad electrica; no ofrece informacion sobre la actividad mecanica del corazon. \n - Informacion clinica: Se debe tratar a los pacientes de acuerdo con sus sintomas, no solo por el ECG. \n - Informacion clinica: para obtener un ECG de 12 derivaciones se adieren 4 cables en cada extremidad y 6 en diferentes puntos del torax. El total de diez cables provee doce vistas (doce derivaciones)",R.drawable.cardio,""+R.id.botonCapitulo1));
        insertar(db,new Data(16,"Derivaciones de las exremidades","Los electrodos se colocan en los brazos derecho (RA) e izquierdo (LA), y en las piernas deracha (RL) e izquierda (LL). Con solo cuatro electrodos se registran seis derivaciones que incluyen las estandar (I, II y III) y las aumentadas (aVR, aVL y aVF)",R.drawable.colocacionestandardeelectrodosparaderivacionesdelasextremidades,""+R.id.botonCapitulo1));
        insertar(db,new Data(17,"Derivaciones estandar de las extremidades","Las derivaciones I, II y III constituyen las derivaciones estandar. Si los electrodos se colocan en el brazo derecho e izquierdo, asi como en la pierna izquierda, se forman tres derivaciones. Si se dibuja una linea imaginaria entre cada uno de esos electrodos se forma un eje entre cada par de derivaciones. Los ejes de estas tres derivaciones forman un triangulo equilatero con el corazon en el centro (triangulo de Einthoven).",R.drawable.derivacionesestandardelasextremidades,""+R.id.botonCapitulo1));
        insertar(db,new Data(18,"Derivacion aumentadas de las extremidades","Las derivaciones aVR, aVL y aVF constituyen las derivaciones aumentada. Cada letra de una derivacion aumentada se refiere a un termino especifico: a, aumentada;V, Voltaje; R, brazo derecho, L, brazo izquierdo; F, pie izquierdo",R.drawable.derivacionesaumentadasdelasextremidades,""+R.id.botonCapitulo1));
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
