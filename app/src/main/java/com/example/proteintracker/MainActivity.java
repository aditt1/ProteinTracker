package com.example.proteintracker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("abc","test");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            Log.d("ProteinTracker", savedInstanceState.getString("abc"));
        }

        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);
        Button tablebtn = (Button) findViewById(R.id.buttonTable);
        tablebtn.setOnClickListener(tableButtonListener);
        Button helpBtn = (Button) findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);
        Button testBtn = (Button) findViewById(R.id.buttonTest);
        testBtn.setOnClickListener(testButtonListener);
        Button myBtn = (Button) findViewById(R.id.buttonText);
        myBtn.setOnClickListener(myBtnClickListener);
        Button fragmentBtn = (Button) findViewById(R.id.buttonFrag);
        fragmentBtn.setOnClickListener(fragOnClickListener);
        Button mahasiswaBtn = (Button) findViewById(R.id.btnMahasiswa);
        mahasiswaBtn.setOnClickListener(mhsOnClickListener);
    }
    private View.OnClickListener mhsOnClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,MainActivityMahasiswa.class);
            Bundle f = new Bundle();
            intent.putExtras(f);
            startActivity(intent);
        }
    };

    private View.OnClickListener fragOnClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,MainActivityFragment.class);
            Bundle e = new Bundle();
            intent.putExtras(e);
            startActivity(intent);
        }
    };

    private View.OnClickListener tableButtonListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,MainActivityTable.class);
            Bundle d = new Bundle();
            intent.putExtras(d);
            startActivity(intent);
        }
    };

    private View.OnClickListener helpButtonListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);
            Bundle b = new Bundle();
            EditText myEditText = (EditText)findViewById(R.id.editText1);
            b.putString("helpString",myEditText.getText().toString());
            intent.putExtras(b);
            startActivity(intent);
        }
    };

    private View.OnClickListener testButtonListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            Bundle a = new Bundle();
            intent.putExtras(a);
            startActivity(intent);
        }
    };

    private View.OnClickListener myBtnClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,MainActivity3.class);
            Bundle c = new Bundle();
            intent.putExtras(c);
            startActivity(intent);
        }

    };

}
