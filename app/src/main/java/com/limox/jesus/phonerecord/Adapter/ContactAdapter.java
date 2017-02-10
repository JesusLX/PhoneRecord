package com.limox.jesus.phonerecord.Adapter;

import android.content.Context;
import android.database.Cursor;
import android.provider.CallLog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.limox.jesus.phonerecord.Provider.RecordContrat;
import com.limox.jesus.phonerecord.R;

/**
 * Created by usuario on 10/02/17.
 */

public class ContactAdapter extends CursorAdapter {

    public ContactAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }
    public class ContactHolder{
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
        holder.txvPhone.setText(cursor.getString(RecordContrat.Record.NUMBER_KEY));
        holder.txvTime.setText(cursor.getString(RecordContrat.Record.DURATION_KEY));
        holder.txvType.setText(cursor.getString(RecordContrat.Record.TYPE_KEY));
    }
}
