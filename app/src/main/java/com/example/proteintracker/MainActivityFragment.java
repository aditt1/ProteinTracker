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
                BlankFragment blankFragment = BlankFragment.newInstance("Hai", "Para Prgmobers");
                ft.replace(R.id.frameLayout2, blankFragment);
                ft.commit();
            }
        });
    }

    @Override
    public void SendData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        BlankFragment2 blankFragment2 = BlankFragment2.newInstance(Message, "Para Progmobers");
        ft.replace(R.id.frameLayout2, blankFragment2);
        ft.commit();
    }
}
