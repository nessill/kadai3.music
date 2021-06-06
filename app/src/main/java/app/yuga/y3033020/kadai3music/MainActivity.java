package app.yuga.y3033020.kadai3music;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer player;

    @Override
    protected void onResume() {
        super.onResume();
        player = MediaPlayer.create(this, R.raw.lofi);
        player.start();
    }


    protected void onPause() {
        super.onPause();
        player.stop();
        player.release();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}