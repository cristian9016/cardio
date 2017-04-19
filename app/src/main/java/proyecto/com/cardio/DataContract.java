package proyecto.com.cardio;

import android.provider.BaseColumns;

/**
 * Created by root on 18/04/17.
 */

public class DataContract {

    public static abstract class DataEntry implements BaseColumns{

        public static final String tableName = "datos";
        public static final String ID = "id";
        public static final String TITLE = "title";
        public static final String TEXT = "text";
        public static final String IMAGE = "image";

    }

}
