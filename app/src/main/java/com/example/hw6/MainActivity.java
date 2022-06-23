package com.example.hw6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText text1 = (findViewById(R.id.et_1));
        EditText text2 = (findViewById(R.id.et_2));
        Button login = findViewById(R.id.btn_login);
        ContextCompat.getColor(getApplicationContext(), R.color.orange);
        String password = "admin";


        text1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().trim().length() > 0){
                    login.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.orange));
                }
                else
                    login.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.gray));
            }
        });

        text2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().trim().length() > 0){
                    login.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.orange));
                }
                else
                    login.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.gray));
            }
        });


        login.setOnClickListener(view -> {
            if(text1.getText().toString().equals(password) && text2.getText().toString().equals(password)){
                Toast.makeText(this, "Вы успешно зарегестрировались", Toast.LENGTH_SHORT).show();
                findViewById(R.id.tv_login).setVisibility(View.GONE);
                findViewById(R.id.linear_layout).setVisibility(View.GONE);
            }
            else
                Toast.makeText(this, "Неверный логин и пароль", Toast.LENGTH_SHORT).show();
        });
    }
}