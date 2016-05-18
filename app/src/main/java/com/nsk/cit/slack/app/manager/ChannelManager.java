package com.nsk.cit.slack.app.manager;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ListView;

import com.nsk.cit.slack.app.R;
import com.nsk.cit.slack.app.business.ChannelBusiness;
import com.nsk.cit.slack.app.entity.channel.ChannelWrapper;
import com.nsk.cit.slack.app.ui.adapters.CustomChannelAdapter;

/**
 * Created by eltonjhony on 15/05/16.
 */
public class ChannelManager {

    private Context mContext;
    private ListView mListView;
    private ProgressDialog mProgressDialog;

    public ChannelManager(Context mContext, ListView mListView) {
        this.mContext = mContext;
        this.mListView = mListView;
    }

    public void getSlackChannelsInfo() {
        AsyncTask<Void, Void, ChannelWrapper> task = new AsyncTask<Void, Void, ChannelWrapper>() {

            @Override
            protected void onPreExecute() {
                mProgressDialog = new ProgressDialog(mContext);
                mProgressDialog.show();
                mProgressDialog.setMessage(mContext.getString(R.string.wait));
            }

            @Override
            protected ChannelWrapper doInBackground(Void... params) {
                try {
                    ChannelBusiness business = new ChannelBusiness();
                    return business.retrieveChannels();
                } catch (Exception ex) {
                    Log.e("Unexpected Error", ex.getMessage());
                }
                return null;
            }

            @Override
            protected void onPostExecute(ChannelWrapper channelWrapper) {
                super.onPostExecute(channelWrapper);
                mProgressDialog.dismiss();
                if (channelWrapper != null) {
                    CustomChannelAdapter adapter = new CustomChannelAdapter(mContext,
                            R.layout.channel_row_list,
                            channelWrapper.getChannels());
                    mListView.setAdapter(adapter);
                }
            }

            @Override
            protected void onCancelled() {
                super.onCancelled();
            }
        };

        task.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

}
