package com.example.aegis.linkup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuccessfulMatchActivity extends AppCompatActivity {

    private String Name;
    private String Location;
    private String Age;
    private String Description;
    private String[] Games;

    private Button YesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_match);

        Games = getIntent().getStringArrayExtra("games");
        Name = getIntent().getStringExtra("name");
        Age = getIntent().getStringExtra("age");
        Location = getIntent().getStringExtra("location");
        Description = getIntent().getStringExtra("description");

        YesButton = (Button)findViewById(R.id.button10);

        YesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hello = new Intent(SuccessfulMatchActivity.this, MainProfileActivity.class);
                hello.putExtra("name", Name);
                hello.putExtra("location", Location);
                hello.putExtra("age", Age);
                hello.putExtra("description", Description);
                hello.putExtra("games", Games);
                startActivity(hello);
            }
        });
    }
}
