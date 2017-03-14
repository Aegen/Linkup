package com.example.aegis.linkup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChooseGameActivity extends AppCompatActivity {

    private String Name;
    private String Location;
    private String Age;
    private String Description;
    private String[] Games;

    private ListView gameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_game);

        gameList = (ListView)findViewById(R.id.TheGameList);

        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]{"Pandemic"});

        gameList.setAdapter(ad);

        Games = getIntent().getStringArrayExtra("games");
        Name = getIntent().getStringExtra("name");
        Age = getIntent().getStringExtra("age");
        Location = getIntent().getStringExtra("location");
        Description = getIntent().getStringExtra("description");

        gameList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent hello = new Intent(ChooseGameActivity.this, MainProfileActivity.class);

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
