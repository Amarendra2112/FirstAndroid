package com.example.funzone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;


public class paper extends AppCompatActivity implements View.OnClickListener {
    Button play1;
    Button play2;
    Button winner;
    Button newGame;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paper);
        play1 = (Button) findViewById(R.id.Play1);
        play2 = (Button) findViewById(R.id.Play2);
        winner = (Button) findViewById(R.id.Winner);
        newGame = (Button) findViewById(R.id.newgame);
        play1.setOnClickListener(this);
        play2.setOnClickListener(this);
        newGame.setOnClickListener(this);
    }

    public int random()
    {
        Random ran = new Random();
         return ran.nextInt(3);
    }

    public void winner()
    {
        if(play1.getText()=="Paper")
        {
            if(play2.getText()=="Paper")
            {
                winner.setText("It's a draw. But fire beats all");
            }
            if(play2.getText()=="Scissor")
            {
                winner.setText("Player2 win!!");
            }
            if(play2.getText()=="Stone")
            {
                winner.setText("Player1 win!!");
            }
        }

        if(play1.getText()=="Scissor")
        {
            if(play2.getText()=="Paper")
            {
                winner.setText("Player1 win!!");
            }
            if(play2.getText()=="Scissor")
            {
                winner.setText("It's a draw. But fire beats all");
            }
            if(play2.getText()=="Stone")
            {
                winner.setText("Player2 win!!");
            }
        }

        if(play1.getText()=="Stone")
        {
            if(play2.getText()=="Paper")
            {
                winner.setText("Player2 win!!");
            }
            if(play2.getText()=="Scissor")
            {
                winner.setText("Player1 win!!");
            }
            if(play2.getText()=="Stone")
            {
                winner.setText("It a draw. But fire beats all");
            }
        }
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.Play1 || v.getId() == R.id.Play2)

        {
            if(v.getId()== R.id.Play1)
            {
                int a= random();
                if(a == 0)
                {
                    play1.setText("Paper");
                }
                if(a==1)
                {
                    play1.setText("Scissor");
                }
                if(a==2)
                {
                    play1.setText("Stone");
                }
            }

            if(v.getId()== R.id.Play2)
            {
                int a = random();
                if(a == 0)
                {
                    play2.setText("Paper");
                }
                if(a==1)
                {
                    play2.setText("Scissor");
                }
                if(a==2)
                {
                    play2.setText("Stone");
                }
                winner();
            }

        }

        if(v.getId()==R.id.newgame)
        {
            play1.setText(null);
            play2.setText(null);
            winner.setText(null);
        }

    }

}
