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
    TextView nama2;

    //Mendeklarasikan variabel dengan tipe data TextView
    EditText Dtask, DjTask, Dttask;

    //deklarasi variabel dengan tipe data floating action button
    FloatingActionButton nambah;

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
        nama2 = findViewById(R.id.eNma);
        nambah = findViewById(R.id.floatingActionButton);

        nambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                namatask = Dtask.getText().toString();
                jenistask = DjTask.getText().toString();
                timetask = Dttask.getText().toString();

                if(namatask.length()==0){
                    Dtask.setError("Isi Nama Task");
                    Toast.makeText(getApplicationContext(), "Isi semua data", Toast.LENGTH_SHORT).show();
                }
                else if(jenistask.length()==0){
                    DjTask.setError("Isi Jenis Task");
                    Toast.makeText(getApplicationContext(), "Isi semua data", Toast.LENGTH_SHORT).show();
                }
                else if(timetask.length()==0){
                    Dttask.setError("Isi TimeTask");
                    Toast.makeText(getApplicationContext(), "Isi semua data", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Sukses isi task", Toast.LENGTH_SHORT).show();

                    Bundle b = new Bundle();

                    b.putString("task", namatask.trim());
                    b.putString("task", jenistask.trim());
                    b.putString("task", timetask.trim());

                    Intent in = new Intent(getApplicationContext(), TaskHasil.class);

                    in.putExtras(b);
                    startActivity(in);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.mnSubmit) {
            namatask = Dtask.getText().toString();
            jenistask = DjTask.getText().toString();
            timetask = Dttask.getText().toString();

            if (namatask.length() == 0) {
                Dtask.setError("Isi Nama Task");
                Toast.makeText(getApplicationContext(), "Isi semua data", Toast.LENGTH_SHORT).show();
            } else if (jenistask.length() == 0) {
                DjTask.setError("Isi Jenis Task");
                Toast.makeText(getApplicationContext(), "Isi semua data", Toast.LENGTH_SHORT).show();
            } else if (timetask.length() == 0) {
                Dttask.setError("Isi TimeTask");
                Toast.makeText(getApplicationContext(), "Isi semua data", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Sukses isi task", Toast.LENGTH_SHORT).show();

                Bundle b = new Bundle();

                b.putString("x", namatask.trim());
                b.putString("y", jenistask.trim());
                b.putString("z", timetask.trim());

                Intent in = new Intent(getApplicationContext(), TaskHasil.class);

                in.putExtras(b);
                startActivity(in);
            }
        }
        else{
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}