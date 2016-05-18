package com.nsk.cit.slack.app.ui.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import com.nsk.cit.slack.app.R;
import com.nsk.cit.slack.app.entity.channel.Channel;

/**
 * Created by eltonjhony on 15/05/16.
 */
public class CustomChannelAdapter extends ArrayAdapter<Channel> {

    private Context mContext;
    private int mLayoutResourceId;
    private List<Channel> mChannels;

    public CustomChannelAdapter(Context mContext, int mLayoutResourceId, List<Channel> mChannels) {
        super(mContext, mLayoutResourceId, mChannels);
        this.mContext = mContext;
        this.mLayoutResourceId = mLayoutResourceId;
        this.mChannels = mChannels;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(mLayoutResourceId, parent, false);
        }

        Channel channel = mChannels.get(position);

        TextView textViewName = (TextView) convertView.findViewById(R.id.textViewName);
        textViewName.setText(channel.getName());

        TextView textViewPurpose = (TextView) convertView.findViewById(R.id.textViewPurpose);
        textViewPurpose.setText(channel.getPurpose().getValue());

        return convertView;
    }
}
