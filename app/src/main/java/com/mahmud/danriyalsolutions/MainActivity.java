package com.mahmud.danriyalsolutions;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    EditText userEmail, passWord;
    MaterialButton btnSignIn;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userEmail = findViewById(R.id.userEmail);
        passWord = findViewById(R.id.passWord);
        btnSignIn = findViewById(R.id.btnSignIn);
        register = findViewById(R.id.register);

        //admin and admin
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = userEmail.getText().toString();
                String pass = passWord.getText().toString();


                if (username.length() >0 && pass.length()>0){

                    if (userEmail.getText().toString().equals("admin") && passWord.getText().toString().equals("admin")){
                        Toast.makeText(MainActivity.this, "Log In Successful", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Log In Failed !!", Toast.LENGTH_SHORT).show();
                    }
                }else if (username.length() <1 && pass.length()>0){
                    userEmail.setError("Please enter your username");

                }else if (username.length() >0){
                    passWord.setError("Please enter your password");
                }
                else {
                    userEmail.setError("Please enter your username");
                    passWord.setError("Please enter your password");
                }
            }
        });
        
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Registration.class));
            }
        });

        


    }

}