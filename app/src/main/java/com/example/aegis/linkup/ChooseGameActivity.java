package com.example.aegis.linkup;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.HashSet;
import java.util.Set;

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


//        Games = getIntent().getStringArrayExtra("games");
//        Name = getIntent().getStringExtra("name");
//        Age = getIntent().getStringExtra("age");
//        Location = getIntent().getStringExtra("location");
//        Description = getIntent().getStringExtra("description");

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        Set<String> GamesSet = sharedPref.getStringSet("games",new HashSet<String>());
        Games = GamesSet.toArray(new String[GamesSet.size()]);

        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Games);

        gameList.setAdapter(ad);


        gameList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent hello = new Intent(ChooseGameActivity.this, PresentMatchActivity.class);

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
