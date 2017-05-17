package com.example.shiv.myuiclickdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button, downButton;
    String a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
myView();




        downButton = (Button)findViewById(R.id.downButton);
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "self implemented", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void myView() {
        button = (Button)findViewById(R.id.centerButton);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.centerButton){
            Toast.makeText(MainActivity.this, "class implemented", Toast.LENGTH_SHORT).show();
        }

    }
}
