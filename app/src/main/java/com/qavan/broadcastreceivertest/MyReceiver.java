package com.qavan.broadcastreceivertest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Starting service...", Toast.LENGTH_LONG).show();
        context.startService(new Intent(context, MyService.class));
        context.startActivity(new Intent(context, MainActivity.class));
    }
}

