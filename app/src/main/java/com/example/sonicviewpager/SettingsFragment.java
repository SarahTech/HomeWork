package com.example.sonicviewpager;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends Fragment {


    public SettingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_settings, container, false);

        final EditText t = v.findViewById(R.id.editText2);
        Button save = v.findViewById(R.id.button);
        FloatingActionButton f = v.findViewById(R.id.floatingActionButton);
        FloatingActionButton f2 = v.findViewById(R.id.floatingActionButton2);

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.mediaPlayer.start();
                MainActivity.yes.stop();
            }
        });


        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.yes.start();
                MainActivity.mediaPlayer.stop();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity.mediaPlayer.stop();
                MainActivity.yes.stop();



                SharedPreferences preferences = getActivity().getSharedPreferences("pref", Context.MODE_PRIVATE);
                SharedPreferences.Editor edt = preferences.edit();
                edt.putString("username",t.getText().toString());
                edt.commit();

                Intent i2 = new Intent(getActivity(),Main2Activity.class);
                startActivity(i2);
            }
        });


        return v;
    }

}
