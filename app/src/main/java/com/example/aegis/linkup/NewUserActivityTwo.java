package com.example.aegis.linkup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class NewUserActivityTwo extends AppCompatActivity {


    private Button NextButton;

    private EditText NameField;
    private EditText AgeField;
    private EditText LocationField;
    private EditText DescriptionField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_two);

        NextButton = (Button)findViewById(R.id.button);
        NameField = (EditText)findViewById(R.id.editText);
        AgeField = (EditText)findViewById(R.id.editText4);
        DescriptionField = (EditText)findViewById(R.id.editText3);
        LocationField = (EditText)findViewById(R.id.editText2);

        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToGames = new Intent(NewUserActivityTwo.this, AddGamesActivity.class);
                goToGames.putExtra("name", NameField.getText().toString());
                goToGames.putExtra("age", AgeField.getText().toString());
                goToGames.putExtra("description", DescriptionField.getText().toString());
                goToGames.putExtra("location", LocationField.getText().toString());
                startActivity(goToGames);
            }
        });

    }
}
