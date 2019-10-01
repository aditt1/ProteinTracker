package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivityMahasiswa extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mahasiswa);

        Button btnAct = findViewById(R.id.btnActivity);
        btnAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                MahasiswaFragment mhsFragment = new MahasiswaFragment();
                ft.add(R.id.FrameLayout, mhsFragment);
                ft.addToBackStack("mhsFragment");
                ft.commit();
            }


        });
    }
}