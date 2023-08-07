package com.example.standardsell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Report extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.reportID);
        bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.reportID:
                    return true;

                case R.id.homeID:
                    startActivity(new Intent(getApplicationContext(),Business.class));
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
                    finish();
                    return true;

                case R.id.profileID:
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
                    finish();
                    return true;


                case R.id.businessID:
                    startActivity(new Intent(getApplicationContext(),Post.class));
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
                    finish();
                    return true;

                case R.id.postID:
                    startActivity(new Intent(getApplicationContext(),Report.class));
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
                    finish();
                    return true;

            }
            return false;
        });
    }
}