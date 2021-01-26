package com.example.apppracticados;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class SecondActivity extends AppCompatActivity {
    private YouTubePlayerView myYTBViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new AppLifeManager().setOwner(getLifecycle());
        myYTBViewer = findViewById(R.id.activity_main_youtubePlayerView);

        getLifecycle().addObserver(myYTBViewer);

    }
}