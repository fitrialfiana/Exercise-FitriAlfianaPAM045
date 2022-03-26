package com.example.exercise1pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class HalamanHasil extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data TextView
    EditText Dwelcome, Demail, DPass, DRpass;

    //deklarasi variabel dengan tipe data floating action button
    FloatingActionButton fab;

    @Override
    protected void onCreate (Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_halaman_hasil);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        Dwelcome = findViewById(R.id.eNma);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        Demail = findViewById(R.id.eMT);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        DPass = findViewById(R.id.eJT);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        DRpass = findViewById(R.id.eTimeT);

        //mendeklarasikan variabel bundle yang akan digunakan untuk mengambil
        // pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirimkan dari activity sebelumnya dengan kunci "a"
        String nama = bundle.getString("a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirimkan dari activity sebelumnya dengan kunci "b"
        String email = bundle.getString("b");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("c");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirimkan dari activity sebelumnya dengan kunci "b"
        String repass = bundle.getString("d");

        //menampilkan value dari variabel email kedalam txEmail
        Dwelcome.setText(nama);

        //menampilkan value dart variabel pass kedalam txPassword
        Demail.setText(email);

        //menampilkan value dari variabel email kedalam txEmail
        DPass.setText(pass);

        //menampilkan value dart variabel pass kedalam txPassword
        DRpass.setText(repass);

    }

}