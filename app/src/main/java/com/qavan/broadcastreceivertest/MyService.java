package com.qavan.broadcastreceivertest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent pIntent, int flags, int startId) {
        Toast.makeText(this, "Вроде", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Должно", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Работать", Toast.LENGTH_LONG).show();
        return super.onStartCommand(pIntent, flags, startId);
    }
}