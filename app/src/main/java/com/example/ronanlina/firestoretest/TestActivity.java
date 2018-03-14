package com.example.ronanlina.firestoretest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class TestActivity extends AppCompatActivity {

    //member vars
    Button maddActivity;
    EditText mBudget;
    ListView mResto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        maddActivity = (Button) findViewById(R.id.toAddActButton);
        mBudget = (EditText) findViewById(R.id.budgetInput);
        mResto = (ListView) findViewById(R.id.resultsView);

        //change layout to add activity
        maddActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });



    }
}
