package com.example.aegis.linkup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ManagePeople extends AppCompatActivity {
    private ListView namesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_people);
        namesList = (ListView) findViewById(R.id.namesList);

        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new String[]{"Henry"});
        namesList.setAdapter(ad);

        namesList.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent toOtherProfile = new Intent(ManagePeople.this,OtherProfileActivity.class);
                startActivity(toOtherProfile);
            }
        });
    }
}
