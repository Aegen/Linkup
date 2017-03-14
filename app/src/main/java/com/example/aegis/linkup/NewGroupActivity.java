package com.example.aegis.linkup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class NewGroupActivity extends AppCompatActivity {

    private Button AddMembersButton;
    private Button ConfirmButton;
    private ListView MembersList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_group);

        AddMembersButton = (Button)findViewById(R.id.button8);
        ConfirmButton = (Button)findViewById(R.id.button9);
        MembersList = (ListView)findViewById(R.id.groupListView);
        final ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        MembersList.setAdapter(ad);

        AddMembersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hello = new Intent(NewGroupActivity.this, GroupMemberOptionsActivity.class);
                startActivity(hello);

                ad.add("Henry");
            }
        });

        ConfirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hello = new Intent(NewGroupActivity.this, MainProfileActivity.class);

                startActivity(hello);
            }
        });

    }
}
