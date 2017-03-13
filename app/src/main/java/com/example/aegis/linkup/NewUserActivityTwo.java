package com.example.aegis.linkup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class NewUserActivityTwo extends AppCompatActivity {


    private Button NextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_two);

        NextButton = (Button)findViewById(R.id.button);

        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToGames = new Intent(NewUserActivityTwo.this, AddGamesActivity.class);
                startActivity(goToGames);
            }
        });

    }
}
