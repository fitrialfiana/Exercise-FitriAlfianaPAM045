package com.example.exercise1pam;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HalamanKedua extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data Textview
    EditText txEmail, edPass, erepass, edAlamat;

    @Override
    protected void onCreate (Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.halamankedua);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        txEmail = findViewById(R.id.tvEmail);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        edPass = findViewById(R.id.tvPassword);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        edAlamat = findViewById(R.id.emNama);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        erepass = findViewById(R.id.eMrepas);

        //mendeklarasikan variabel bundle yang akan digunakan untuk mengambil
        // pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");


    }
}