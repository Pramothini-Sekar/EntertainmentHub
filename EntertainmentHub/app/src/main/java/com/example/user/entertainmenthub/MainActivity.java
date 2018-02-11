package com.example.user.entertainmenthub;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener, View.OnClickListener  {

    Button b;
    VideoView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(this);
        b.setVisibility(View.INVISIBLE);
        v=(VideoView)findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(v);
        //Setting MediaController and URI, then starting the videoView
        v.setMediaController(mediaController);String path = "android.resource://" + getPackageName() + "/" + R.raw.video;
        v.setVideoURI(Uri.parse(path));
        v.requestFocus();
        v.start();
        v.setOnCompletionListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            Toast.makeText(getApplicationContext(), "Ta-Da", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);

        }
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        v.setVisibility(View.INVISIBLE);
        b.setVisibility(View.VISIBLE);
    }
}