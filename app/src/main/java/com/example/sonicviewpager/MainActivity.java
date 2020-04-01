package com.example.sonicviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    public static MediaPlayer mediaPlayer;
    public static MediaPlayer yes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = MediaPlayer.create(this,R.raw.titlescreen);
        mediaPlayer = MediaPlayer.create(this, R.raw.sonicmusic);
        mediaPlayer.start();

        ViewPager vp = findViewById(R.id.viewPager);

        SonicAdapter adapter = new SonicAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);

        TabLayout tab = findViewById(R.id.myTab);

        tab.setupWithViewPager(vp);

        tab.getTabAt(0).setIcon(R.drawable.ic_sonicicon);
        tab.getTabAt(1).setIcon(R.drawable.ic_knucklesicon);
        tab.getTabAt(2).setIcon(R.drawable.ic_animal_kingdom);
        tab.getTabAt(3).setIcon(R.drawable.ic_shadowicon);
        tab.getTabAt(4).setIcon(R.drawable.ic_settings_black_24dp);


    }
}
