package com.project.art.digital.android.myapplication5;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText textusername, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLogin(View v) {
        textusername = (EditText) findViewById(R.id.TextUsername);
        password = (EditText) findViewById(R.id.TextPassword);

        String uname = textusername.getText().toString();
        String pass = password.getText().toString();

        if (!validasi(uname, pass)) {
            Context context = MainActivity.this;
            String message = "UserName/Password yang anda masukan salah, coba lagi ^^";
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        } else {
            Context context = MainActivity.this;
            String message = "UserName/Password benar ^^";
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
            Intent submit = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(submit);
        }

    }

    public boolean validasi(String Username, String Password) {
        if (Username.equalsIgnoreCase("om") && Password.equalsIgnoreCase("rahasia")) {
            return true;
        } else {
            return false;
        }

    }
}