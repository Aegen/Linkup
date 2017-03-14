package com.example.aegis.linkup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class AddGamesActivity extends AppCompatActivity {

    private AutoCompleteTextView Howard;
    private Button AddButton;
    private ListView LView;
    private Button DoneButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_games);

        Howard = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        AddButton = (Button)findViewById(R.id.button2);
        LView = (ListView)findViewById(R.id.listView);

        DoneButton = (Button)findViewById(R.id.button4);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.games));

        final ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        Howard.setAdapter(adapter);
        LView.setAdapter(listAdapter);

        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listAdapter.getPosition(Howard.getText().toString()) == -1) {

                    Intent a = new Intent(AddGamesActivity.this, PreferencesActivity.class);
                    startActivity(a);

                    listAdapter.add(Howard.getText().toString());
                }
            }

        });

        DoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AddGamesActivity.this, MainProfileActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onActivityResult(int one, int two, Intent data){
        Toast.makeText(getApplicationContext(), data.getStringExtra("output"), Toast.LENGTH_LONG).show();
    }
}
