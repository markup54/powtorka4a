package com.example.powtorka4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

TextView komunikatTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    komunikatTextView = findViewById(R.id.komunikat);
    komunikatTextView.setText("Autor:00000000000");
    }


    public void sprawdz(View view) {
        EditText mailEditText = findViewById(R.id.editTextTextEmailAddress2);
        String email = mailEditText.getText().toString();
        if(!email.contains("@")){
            komunikatTextView.setText("Nieprawidłowy adres email");
        }
        else{
            EditText hasloEditText1 = findViewById(R.id.editTextTextPassword);
            EditText hasloEditText2 = findViewById(R.id.editTextTextPassword2);
            String haslo1 = hasloEditText1.getText().toString();
            String haslo2 = hasloEditText2.getText().toString();
            if(!haslo1.equals(haslo2)){
                komunikatTextView.setText("Hasła się różnią");
            }
            else{
                komunikatTextView.setText("Witaj "+email);
            }
        }

    }
}