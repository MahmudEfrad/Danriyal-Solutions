package com.mahmud.danriyalsolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Registration extends AppCompatActivity {

    EditText regUsername, regPassword, regEmail, rePassword;
    MaterialButton btnRegister;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        regUsername = findViewById(R.id.regUsername);
        regPassword = findViewById(R.id.regPassword);
        regEmail = findViewById(R.id.regEmail);
        rePassword = findViewById(R.id.rePassword);
        register = findViewById(R.id.register);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = regUsername.getText().toString();
                String email = regEmail.getText().toString();
                String pass = regPassword.getText().toString();
                String repass = rePassword.getText().toString();

                if (username.length()>0 && email.length()>0 && pass.length()>0 && repass.length()>0){

                    if (pass.equals(repass)){
                        String ConfirmPass = regPassword.getText().toString();
                        Toast.makeText(Registration.this, "Username is : "+username, Toast.LENGTH_SHORT).show();
                    }
                    else rePassword.setError("Please Re-type your Password");

                }else {
                    regUsername.setError("Please enter your name");
                    regEmail.setError("Please enter your email");
                    regPassword.setError("Please a password");
                    rePassword.setError("Please a password");
                }

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registration.this, MainActivity.class));
            }
        });

    }
}