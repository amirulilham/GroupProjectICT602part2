package com.example.groupprojectict602;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Group_Members extends AppCompatActivity {
    ImageButton openActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_members);

        openActivity = (ImageButton) findViewById(R.id.imageButton6);
        openActivity = (ImageButton) findViewById(R.id.imageButton7);
    }

    public void openActivity1(View view){
        Intent intent = new Intent (this, SearchLocations.class);
        startActivity(intent);
    }

    public void openActivity2(View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}