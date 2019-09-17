package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityMahasiswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mahasiswa);

        Button BtnAct = (Button) findViewById(R.id.btnActivity);
        BtnAct.setOnClickListener(mhsOnClickListener);
    }

    private View.OnClickListener mhsOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivityMahasiswa.this, MahasiswaFragment.class);
            Bundle f = new Bundle();
            intent.putExtras(f);
            startActivity(intent);
        }
    };
}

