package com.qavan.broadcastreceivertest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    private Intent INTENT;
    private Context mContext;
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Starting service...", Toast.LENGTH_LONG).show();
        INTENT = new Intent(context, MyService.class);
        mContext = context;
        try {
            pvmc();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        context.startActivity(new Intent(context, MainActivity.class));
    }

    public void pvmc() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            mContext.startService(INTENT);
            Thread.sleep(3000);
            mContext.stopService(INTENT);
        }
    }
}

