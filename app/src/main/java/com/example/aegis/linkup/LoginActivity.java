package com.example.aegis.linkup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button LoginButton;
    private Button NewUserButton;
    private EditText UsernameField;
    private EditText PasswordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton = (Button)findViewById(R.id.loginButton);
        NewUserButton = (Button)findViewById(R.id.newUserButton);
        UsernameField = (EditText)findViewById(R.id.loginUsernameField);
        PasswordField = (EditText)findViewById(R.id.loginPasswordField);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Not Implemented", Toast.LENGTH_SHORT).show();
            }
        });

        NewUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToNewUser = new Intent(LoginActivity.this, NewUserActivity.class);
                startActivity(goToNewUser);
            }
        });
    }
}
