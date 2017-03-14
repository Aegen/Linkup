package com.example.aegis.linkup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PresentMatchActivity extends AppCompatActivity {

    private String Name;
    private String Location;
    private String Age;
    private String Description;
    private String[] Games;

    private Button YesButton;
    private TextView LocationField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present_match);

//        Games = getIntent().getStringArrayExtra("games");
//        Name = getIntent().getStringExtra("name");
//        Age = getIntent().getStringExtra("age");
//        Location = getIntent().getStringExtra("location");
//        Description = getIntent().getStringExtra("description");

        YesButton = (Button)findViewById(R.id.YesButton);
        LocationField = (TextView)findViewById(R.id.textView30);

        LocationField.setText("Location: " + Location);


        YesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hello = new Intent(PresentMatchActivity.this, SuccessfulMatchActivity.class);
//                hello.putExtra("name", Name);
//                hello.putExtra("location", Location);
//                hello.putExtra("age", Age);
//                hello.putExtra("description", Description);
//                hello.putExtra("games", Games);
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e){

                }
                startActivity(hello);
            }
        });


    }
}
