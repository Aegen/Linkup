package com.example.aegis.linkup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class NewUserActivityTwo extends AppCompatActivity {


    private AutoCompleteTextView Howard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_two);

        //Howard = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, new String[]{"Betrayal at House on the Hill", "Catan","Carcassonne", "Dead of Winter"});



    }
}
