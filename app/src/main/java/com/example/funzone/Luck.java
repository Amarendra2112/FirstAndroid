package com.example.funzone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

public class Luck extends AppCompatActivity implements View.OnClickListener{

    Button button1;
    Button button2;
    Button button3;
    Button Jackpot;
    Button newGame;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lucky_draw);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        Jackpot=(Button) findViewById(R.id.Jackpot);
        newGame=(Button) findViewById(R.id.newgame);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        newGame.setOnClickListener(this);
    }


    public int random()
    {
        Random ran = new Random();
        return ran.nextInt(100);
    }

    public void jackpot()
    {
        if(button1.getText()==button2.getText() && button2.getText()==button3.getText())
        {
            Jackpot.setText("It's a Jackpot!! It's your Lucky day");
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button1)
        {
            long a = (long) random();
            if(a%2 == 0)
            {
                button1.setText("Head");
            }
            else
            {
                button1.setText("Tail");
            }
        }

        if(v.getId()==R.id.button2)
        {
            long a = (long) random();
            if(a%2 == 0)
            {
                button2.setText("Head");
            }
            else
            {
                button2.setText("Tail");
            }
        }

        if(v.getId()==R.id.button3)
        {
            long a = (long) random();
            if(a%2 == 0)
            {
                button3.setText("Head");
            }
            else
            {
                button3.setText("Tail");
            }
        jackpot();
        }
        if(v.getId() == R.id.newgame)
        {
            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            Jackpot.setText(null);
        }
    }

}
