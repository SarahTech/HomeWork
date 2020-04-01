package com.example.sonicviewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("pref", Context.MODE_PRIVATE);
        String user = preferences.getString("username","user");
        TextView t = findViewById(R.id.textView3);
        t.setText(user);



        Handler h = new Handler(getMainLooper());
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(i);
            }
        }, 3000);
    }
}
