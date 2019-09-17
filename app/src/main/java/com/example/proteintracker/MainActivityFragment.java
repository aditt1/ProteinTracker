package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityFragment extends AppCompatActivity
        implements BlankFragment.SendMessage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

        Button btnAct = findViewById(R.id.btnActivity);
        btnAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                BlankFragment proteinFragment = BlankFragment.newInstance("Hai", "Para Prgmobers");
                ft.replace(R.id.frameLayout, proteinFragment);
                ft.commit();
            }
        });
    }

    @Override
    public void SendData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        BlankFragment2 proteinFragment2 = BlankFragment2.newInstance(Message, "Para Progmobers");
        ft.replace(R.id.frameLayout, proteinFragment2);
        ft.commit();
    }
}
