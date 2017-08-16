package com.olegsagenadatrytwo.broadcastreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by omcna on 8/15/2017.
 */

public class MyDynamicReceiver extends BroadcastReceiver {
    private static final String TAG = "MyDynamicReceiver";
    private TextView text;

    public MyDynamicReceiver(TextView text) {
        this.text = text;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: ");
        switch (intent.getAction()){

            case "changeText":
                text.setText(intent.getStringExtra("data"));
                break;

        }
    }
}
