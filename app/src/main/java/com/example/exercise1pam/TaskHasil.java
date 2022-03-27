package com.example.exercise1pam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TaskHasil extends AppCompatActivity {
    TextView nama;

    //Mendeklarasikan variabel dengan tipe data TextView
    EditText Dtask, DjTask, Dttask;

    //deklarasi variabel dengan tipe data floating action button
    FloatingActionButton fab;

    String namatask, jenistask, timetask;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate (Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.taskhasil);

        Dtask = findViewById(R.id.eMT);
        DjTask = findViewById(R.id.eJT);
        Dttask = findViewById(R.id.eTimeT);
        nama = findViewById(R.id.eNma);
        fab = findViewById(R.id.floatingActionButton);

        //mendeklarasikan variabel bundle yang akan digunakan untuk mengambil pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        namatask = bundle.getString("a");
        jenistask = bundle.getString("b");
        timetask = bundle.getString("c");

        Dtask.setText(namatask);
        DjTask.setText(jenistask);
        Dttask.setText(timetask);
    }
}