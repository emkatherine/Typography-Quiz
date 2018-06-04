package com.example.mkreh.typographyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * variable for keeping track of correct answers
     */
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void qOne (){
        String correct ="tittle";
        if(correct == "tittle") {
            i++;
        }else{
            i=i+0;
        }
    }

    public void getScore(){
        System.out.print("Score = " + i + "/8");
    }

    public void i (int score) {
        TextView scoreView = (TextView) findViewById(R.id.getScore);
        scoreView.setText(String.valueOf(score));
    }







}
