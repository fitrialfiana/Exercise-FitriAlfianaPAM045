package com.example.exercise1pam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HalamanKedua extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data Textview
    EditText txEmail, edPass, erepass, edAlamat;

    //Deklarasi variabel untuk button
    Button btnRegister;

    String taEmail;


    @Override
    protected void onCreate (Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.halamankedua);

        //menghubungkan variabel btnRegis dengan component pada layout
        btnRegister = findViewById(R.id.btReg);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        txEmail = findViewById(R.id.tvEmail);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        edPass = findViewById(R.id.tvPassword);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        edAlamat = findViewById(R.id.emNama);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        erepass = findViewById(R.id.eMrepas);
        taEmail = txEmail.getText().toString();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("a",taEmail.trim());
                //Membuat objek intent berpindah activity dari halamankedua ke ActivityHasil
                Intent i = new Intent(getApplicationContext(), HalamanHasil.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });


    }
}