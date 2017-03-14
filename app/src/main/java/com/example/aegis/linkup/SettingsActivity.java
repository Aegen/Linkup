package com.example.aegis.linkup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    private String Name;
    private String Location;
    private String Age;
    private String Description;
    private String[] Games;

    private Button ManageProfileButton;
    private Button ManageGroupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

//        Games = getIntent().getStringArrayExtra("games");
//        Name = getIntent().getStringExtra("name");
//        Age = getIntent().getStringExtra("age");
//        Location = getIntent().getStringExtra("location");
//        Description = getIntent().getStringExtra("description");

        ManageProfileButton = (Button)findViewById(R.id.ManageProfileButton);
        ManageGroupButton = (Button)findViewById(R.id.ManageGroupProfilesButton);

        ManageProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "It's already perfect", Toast.LENGTH_SHORT).show();
            }
        });

        ManageGroupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hello = new Intent(SettingsActivity.this, SettingsActivityTwo.class);
//                hello.putExtra("name", Name);
//                hello.putExtra("location", Location);
//                hello.putExtra("age", Age);
//                hello.putExtra("description", Description);
//                hello.putExtra("games", Games);
                startActivity(hello);
            }
        });


    }
}
