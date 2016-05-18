package com.nsk.cit.slack.app.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.nsk.cit.slack.app.R;
import com.nsk.cit.slack.app.infrastructure.IntentExtraConstants;
import com.nsk.cit.slack.app.manager.ChannelManager;
import com.nsk.cit.slack.app.entity.channel.Channel;

public class AllChannelsActivity extends Activity {

    //UI references
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_channels);

        listView = (ListView) findViewById(R.id.channel_list_view);
        ChannelManager channelManager = new ChannelManager(this, listView);
        channelManager.getSlackChannelsInfo();

        setListeners();
    }

    private void setListeners() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Channel channel = (Channel) parent.getItemAtPosition(position);
                Intent intent = new Intent(AllChannelsActivity.this, HistoryMessagesActivity.class);
                intent.putExtra(IntentExtraConstants.CHANNEL_ID, channel.getId());
                startActivity(intent);
            }
        });
    }

}
