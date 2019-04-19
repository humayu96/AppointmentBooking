package com.example.darkdeveloper.appointmentbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {

    private final int splash=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,AppointmentService.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        },splash);
    }
}
