package com.example.funzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton paper;
    Button luck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paper=(ImageButton)findViewById(R.id.paper);
        luck=(Button)findViewById(R.id.button);
        paper.setOnClickListener(this);
        luck.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        if(v.getId()== R.id.paper)
        {
            Intent next = new Intent(this, paper.class);
            startActivity(next);
        }
        if(v.getId()== R.id.button)
        {
            Intent next1= new Intent(this,Luck.class);
            startActivity(next1);
        }
    }
}