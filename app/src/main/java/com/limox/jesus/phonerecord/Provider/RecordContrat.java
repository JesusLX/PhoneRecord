package com.limox.jesus.phonerecord.Provider;

import android.net.Uri;
import android.provider.CallLog;

/**
 * Created by usuario on 10/02/17.
 */
public class RecordContrat {

    public static class Record {
        public static String[] PROJECTION = {CallLog.Calls.NUMBER, CallLog.Calls.TYPE, CallLog.Calls.DURATION};
        public static Uri CONTENT_URI = CallLog.Calls.CONTENT_URI;
        public static int NUMBER_KEY = 1;
        public static int TYPE_KEY = 2;
        public static int DURATION_KEY = 3;
    }

}

