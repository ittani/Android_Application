package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
public class MainActivity extends AppCompatActivity  {

   public Button button;
   public Button button2;
    Button button3;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn);

        button2=(Button)findViewById(R.id.btn1);

//        button3=(Button)findViewById(R.id.btn3);
//        txt1=(TextView)findViewById(R.id.txt);
     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent= new Intent(MainActivity.this, Rental1_activity.class);
             startActivity(intent);
         }
     });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });
//        button3.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View view) {
//         if(view.getId() == R.id.btn1){
//             txt1.setText("You are about to Rent a Car!");
//         }
//        if(view.getId() == R.id.btn2){
//            txt1.setText("You are about to Book a Bus Service!");
//        }
//        if(view.getId() == R.id.btn3){
//            txt1.setText("You are about to go on Trip!");
//        }
//    }
}
