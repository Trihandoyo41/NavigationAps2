package com.example.triapps2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.triapps2.R;

public class loginActivity extends AppCompatActivity {

    Button login;
    EditText Username,Password;

    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.login_relatif);

        login = (Button) findViewById(R.id.btnLogin);
        Username = (EditText) findViewById(R.id.etusername);
        Password = (EditText) findViewById(R.id.etpw);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Password.getText().toString().toUpperCase().equals("TEST1"))
                {
                    login_sukses();
                }else
                {
                    Toast.makeText(getApplicationContext(),"Salah password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void login_sukses() {
        String user_login = Username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        //Mengirimkan username nya ke tampilan utama
        i.putExtra("USERNAME",user_login);

        startActivity(i);

    }
}