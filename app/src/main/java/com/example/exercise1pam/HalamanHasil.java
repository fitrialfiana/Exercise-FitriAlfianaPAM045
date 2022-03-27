package com.example.exercise1pam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class HalamanHasil extends AppCompatActivity {
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
        setContentView(R.layout.activity_halaman_hasil);

        Dtask = findViewById(R.id.eMT);
        DjTask = findViewById(R.id.eJT);
        Dttask = findViewById(R.id.eTimeT);
        nama = findViewById(R.id.eNma);
        fab = findViewById(R.id.floatingActionButton);

        //mendeklarasikan variabel bundle yang akan digunakan untuk mengambil pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();
        //membuat variabel string yang digunakan untuk menyimpan data yang dikirimkan dari activity sebelumnya dengan kunci "a"
        namatask = bundle.getString("x");
        //menampilkan value dari variabel email kedalam nama task
        nama.setText(namatask);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle b = new Bundle();
                b.putString("a", namatask.trim());
                b.putString("b", jenistask.trim());
                b.putString("c", timetask.trim());
                Intent i = new Intent(getApplicationContext(), TaskHasil.class);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.mnSubmit)
        {
            Intent i = new Intent(getApplicationContext(), TaskHasil.class);
            startActivity(i);
        }
        else if (item.getItemId() == R.id.mnLogout)
        {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}