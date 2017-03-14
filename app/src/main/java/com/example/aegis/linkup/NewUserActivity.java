package com.example.aegis.linkup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewUserActivity extends AppCompatActivity {

    private Button NextButton;

    private EditText UsernameField;
    private EditText PasswordField;
    private EditText ConfirmPasswordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);


        NextButton = (Button)findViewById(R.id.newUserNextButton);

        UsernameField = (EditText)findViewById(R.id.newUserUsernameField);
        PasswordField = (EditText)findViewById(R.id.newUserPasswordField);
        ConfirmPasswordField = (EditText)findViewById(R.id.newUserConfirmPasswordField);



        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Not Yet Implemented", Toast.LENGTH_SHORT).show();
                Intent goToNext = new Intent(NewUserActivity.this, NewUserActivityTwo.class);

                //goToNext.putExtra("username", UsernameField.getText().toString());
                //goToNext.putExtra("password", PasswordField.getText().toString());

                startActivity(goToNext);
                finish();
            }
        });

    }
}
