package com.nsk.cit.slack.app.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.nsk.cit.slack.app.R;
import com.nsk.cit.slack.app.infrastructure.IntentExtraConstants;

/**
 * Created by eltonjhony on 15/05/16.
 */
public class HistoryMessagesActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_messages);

        String channelId = getIntent().getStringExtra(IntentExtraConstants.CHANNEL_ID);
        Toast.makeText(this, channelId, Toast.LENGTH_LONG).show();
    }
}
