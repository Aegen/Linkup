package com.example.aegis.linkup;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

public class OtherProfileActivity extends AppCompatActivity {

    private TextView DescriptionField;
    private TextView NameField;
    private TextView AgeField;
    private TextView LocationField;
    private ListView GamesList;

    private String Name;
    private String Location;
    private String Age;
    private String Description;
    private String[] Games = {"Pandemic","Settler of Catan"};

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent hello = new Intent(OtherProfileActivity.this, OtherProfileActivity.class);
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    hello = new Intent(OtherProfileActivity.this, OtherProfileActivity.class);
                    break;
                case R.id.navigation_dashboard:
                    hello = new Intent(OtherProfileActivity.this, SettingsActivity.class);
                    break;
                case R.id.navigation_notifications:
                    hello = new Intent(OtherProfileActivity.this, ChooseGameActivity.class);
                    break;

            }

//            hello.putExtra("name", Name);
//            hello.putExtra("location", Location);
//            hello.putExtra("age", Age);
//            hello.putExtra("description", Description);
//            hello.putExtra("games", Games);
            startActivity(hello);

            return true;

        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile);

        GamesList = (ListView)findViewById(R.id.gameList);
        DescriptionField = (TextView) findViewById(R.id.DescriptionField);
        AgeField = (TextView)findViewById(R.id.AgeField);
        NameField = (TextView)findViewById(R.id.nameField);
        LocationField = (TextView)findViewById(R.id.locationField);

//        Games = getIntent().getStringArrayExtra("games");
//        Name = getIntent().getStringExtra("name");
//        Age = getIntent().getStringExtra("age");
//        Location = getIntent().getStringExtra("location");
//        Description = getIntent().getStringExtra("description");

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        Set<String> GamesSet = sharedPref.getStringSet("games",new HashSet<String>());
        Name = "Henry";
        Age = "29";
        Location = "Near you";
        Description = "I love board games with a passion.";


        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Games);
        GamesList.setAdapter(ad);

        DescriptionField.setText(Description);
        AgeField.setText(Age);
        NameField.setText(Name);
        LocationField.setText(Location);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
