package com.example.myapplication6;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.widget.Toast;

public class MyService extends Service {
    private MediaPlayer myplayer;

    @Override
    public void onCreate() {
        Toast.makeText(this, "service create", Toast.LENGTH_SHORT).show();
        myplayer=MediaPlayer.create (this, R.raw.elme7aaa);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        myplayer.start();
        myplayer.setLooping(false);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "service create", Toast.LENGTH_SHORT).show();
        myplayer.stop();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}