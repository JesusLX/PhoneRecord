package com.limox.jesus.phonerecord.Provider;

import android.net.Uri;
import android.provider.BaseColumns;
import android.provider.CallLog.Calls;

/**
 * Created by usuario on 10/02/17.
 */
public class RecordContrat {

    public static class Record implements BaseColumns{
        public static String[] PROJECTION = {_ID,Calls.NUMBER, Calls.TYPE, Calls.DURATION};
        public static Uri CONTENT_URI = Calls.CONTENT_URI;
        public static int NUMBER_KEY = 1;
        public static int TYPE_KEY = 2;
        public static int DURATION_KEY = 3;
    }

}

