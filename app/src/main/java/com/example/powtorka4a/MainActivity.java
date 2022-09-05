package com.example.powtorka4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText loginEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginEditText = findViewById(R.id.editTextTextPersonName);
    }



    public void przepisz(View view) {
        String wpisanyLogin = loginEditText.getText().toString();
        Toast.makeText(this,wpisanyLogin,Toast.LENGTH_SHORT ).show();
    }
}