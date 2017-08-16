package com.olegsagenadatrytwo.broadcastreceiverapp;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MyDynamicReceiver myDynamicReceiver;
    IntentFilter intentFilter;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        myDynamicReceiver =  new MyDynamicReceiver(text);
    }

    @Override
    protected void onStart() {
        super.onStart();
        intentFilter = new IntentFilter();
        intentFilter.addAction("changeText");
        registerReceiver(myDynamicReceiver, intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        //unregisterReceiver(myDynamicReceiver);
    }
}
