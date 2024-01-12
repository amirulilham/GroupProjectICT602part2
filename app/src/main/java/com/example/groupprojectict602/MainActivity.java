package com.example.groupprojectict602;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton openActivity;
    //ImageButton openActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openActivity = (ImageButton) findViewById(R.id.imageButton1);
        openActivity = (ImageButton) findViewById(R.id.imageButton2);
        openActivity = (ImageButton) findViewById(R.id.imageButton5);
    }

    public void openActivity1(View view){
        Intent intent = new Intent (this, Group_Members.class);
        startActivity(intent);
    }

    public void openActivity2(View view){
        Intent intent = new Intent (this, SearchLocations.class);
        startActivity(intent);
    }

    public void openActivity3(View view){
        Intent intent = new Intent (this, AboutApp.class);
        startActivity(intent);
    }
}