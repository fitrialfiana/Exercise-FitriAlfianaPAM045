package com.example.exercise1pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TaskHasil extends AppCompatActivity {
    TextView Dtask2, DjTask2, Dttask2;

    String namatask2, jenistask2, timetask2;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate (Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.taskhasil);

        Dtask2 = findViewById(R.id.eMT2);
        DjTask2 = findViewById(R.id.eJT2);
        Dttask2 = findViewById(R.id.eTimeT2);
        Bundle b = getIntent().getExtras();

        namatask2 = b.getString("a");
        jenistask2 = b.getString("b");
        timetask2 = b.getString("c");

        Dtask2.setText(namatask2);
        DjTask2.setText(jenistask2);
        Dttask2.setText(timetask2);

    }
}