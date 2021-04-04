package com.example.mylab11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

public class icecream extends AppCompatActivity {
    Spinner spinner,spinner2;
    ProgressBar progressBar;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icecream);

        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.quantity);

        progressBar =findViewById(R.id.pb1);
        submit=findViewById(R.id.submit);

        String[] superHero = new String[]{"Bangalore", "Mangalore", "Mysuru", "Ballari", "Vijayapura"};
        String[] quan = new String[]{"1","2","3","4","5"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.spinner_list, superHero);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_list);
        spinner.setAdapter(arrayAdapter);

        ArrayAdapter arrayAdapter1 = new ArrayAdapter<>(this, R.layout.spinner_list, quan);
        arrayAdapter1.setDropDownViewResource(R.layout.spinner_list);
        spinner2.setAdapter(arrayAdapter1);



    }

    public void submit(View view) {
        submit.setText("Please wait...");
        progressBar.setVisibility(View.VISIBLE);

        new Handler(Looper.myLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                submit.setText("Your order is successfully submitted...!!");
                progressBar.setVisibility(View.VISIBLE);
                submit.setTextColor(Color.parseColor("#EC3673"));
                Toast.makeText(getApplicationContext(),"Your order is successfully submitted...!!",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        },5000);
    }
}