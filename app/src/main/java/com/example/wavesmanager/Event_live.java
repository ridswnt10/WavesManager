package com.example.wavesmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Event_live extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_live);

    }
}
