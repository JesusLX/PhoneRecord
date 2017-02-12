package com.limox.jesus.phonerecord.Adapter;

import android.content.Context;
import android.database.Cursor;
import android.provider.CallLog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.limox.jesus.phonerecord.R;

/**
 * Created by usuario on 10/02/17.
 */

public class RecordAdapter extends CursorAdapter {

    public RecordAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    private class ContactHolder{
        TextView txvPhone;
        TextView txvType;
        TextView txvTime;
    }
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ContactHolder holder = new ContactHolder();
        View rootView = inflater.inflate(R.layout.item_contact,viewGroup,false);
        holder.txvPhone = (TextView) rootView.findViewById(R.id.txvNumber);
        holder.txvType = (TextView) rootView.findViewById(R.id.txvType);
        holder.txvTime = (TextView) rootView.findViewById(R.id.txvTime);
        rootView.setTag(holder);
        return rootView;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ContactHolder holder = (ContactHolder) view.getTag();

        holder.txvPhone.setText(cursor.getString(cursor.getColumnIndex(CallLog.Calls.NUMBER)));
        holder.txvTime.setText(cursor.getString(cursor.getColumnIndex(CallLog.Calls.DURATION)));

        String sType= "";
        switch (cursor.getInt(cursor.getColumnIndex(CallLog.Calls.TYPE))){
            case CallLog.Calls.INCOMING_TYPE:
                sType = "ENTRANTE";
                break;
            case CallLog.Calls.OUTGOING_TYPE:
                sType = "SALIENTE";
                break;
            case CallLog.Calls.MISSED_TYPE:
                sType = "PERDIDA";
                break;
        }
        holder.txvType.setText(sType);
    }
}
