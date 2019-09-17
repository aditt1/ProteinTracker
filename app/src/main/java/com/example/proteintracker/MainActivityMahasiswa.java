package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

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
        BtnAct.setOnClickListener(ActOnClickListener);
    }

    private View.OnClickListener ActOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivityMahasiswa.this, MahasiswaFragment.class);
            Bundle g = new Bundle();
            intent.putExtras(g);
            startActivity(intent);
        }
    };
}
