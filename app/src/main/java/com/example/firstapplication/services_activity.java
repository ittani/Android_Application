package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
public class services_activity extends AppCompatActivity {
    public Button button;
    public Button button1;
    public Button button2;
    public  Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        button = (Button) findViewById(R.id.buttonCarRental);
        button1= (Button) findViewById(R.id.buttonBusService);
        button2= (Button) findViewById(R.id.buttonTours);
        button3 =(Button) findViewById(R.id.backButton);
button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent= new Intent(services_activity.this, BusServices.class);
        startActivity(intent);
    }
});
button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(services_activity.this,Register.class);
        startActivity(intent);
    }
});
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent= new Intent(services_activity.this, CarService.class);
        startActivity(intent);
    }
});
button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent= new Intent(services_activity.this, Tours.class);
        startActivity(intent);
    }
});

    }
}