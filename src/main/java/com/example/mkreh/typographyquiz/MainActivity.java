package com.example.mkreh.designquiz_type;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    /**
     * variable for keeping track of correct answers
     */
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Correct answers for the radio button questions
     */

    public void q1rg() {
        RadioButton tittleButton = (RadioButton) findViewById(R.id.tittle);
        tittleButton.isChecked();
        boolean checked = ((RadioButton) tittleButton).isChecked();

        if (checked) {
            i++;
        } else {
            i = i + 0;
        }
        displayScore(i);
    }

    public void q2rg() {
        RadioButton leadingButton = (RadioButton) findViewById(R.id.leading);
        leadingButton.isChecked();
        boolean checked = ((RadioButton) leadingButton).isChecked();

        if (checked) {
            i++;
        } else {
            i = i + 0;
        }
        displayScore(i);
    }

    public void q3rg() {
        RadioButton trueButton = (RadioButton) findViewById(R.id.threeTrue);
        trueButton.isChecked();
        boolean checked = ((RadioButton) trueButton).isChecked();

        if (checked) {
            i++;
        } else {
            i = i + 0;
        }
        displayScore(i);
    }

    public void q5rg() {
        RadioButton letterpressButton = (RadioButton) findViewById(R.id.letterpress);
       letterpressButton.isChecked();
        boolean checked = ((RadioButton) letterpressButton).isChecked();

        if (checked) {
            i++;
        } else {
            i = i + 0;
        }
        displayScore(i);
    }

    public void q7rg() {
        RadioButton ligatureButton = (RadioButton) findViewById(R.id.ligature);
        ligatureButton.isChecked();
        boolean checked = ((RadioButton) ligatureButton).isChecked();

        if (checked) {
            i++;
        } else {
            i = i + 0;
        }
        displayScore(i);
    }

    public void q8rg() {
        RadioButton xheightButton = (RadioButton) findViewById(R.id.xHeight);
        xheightButton.isChecked();
        boolean checked = ((RadioButton) xheightButton).isChecked();

        if (checked) {
            i++;
        } else {
            i = i + 0;
        }
        displayScore(i);
    }

    /**
     * Correct answer for number 6, the edit text question
     */

    public void q6et() {
        String correct = "baseline";
        if (correct == "baseline") {
            i++;
        } else {
            i = i + 0;
        }
        displayScore(i);
    }

    /**
     * Correct answers for number 4, the checkbox question
     */

    public void q4cb() {
        CheckBox fourFuturaCB = (CheckBox) findViewById(R.id.futura);
        Boolean checkFutura = fourFuturaCB.isChecked();

        CheckBox fourFranklinGothicCB = (CheckBox) findViewById(R.id.franklinGothic);
        Boolean checkFranklinGothic = fourFranklinGothicCB.isChecked();

        CheckBox fourUbuntuCB = (CheckBox) findViewById(R.id.ubuntu);
        Boolean checkUbuntu = fourUbuntuCB.isChecked();

        if (fourFuturaCB.isChecked() && fourFranklinGothicCB.isChecked() && fourUbuntuCB.isChecked()){
            i++;
        } else {
            i = i + 0;
        }
        displayScore(i);
    }

    public void displayScore(int score) {
        TextView textView = (TextView) findViewById(R.id.score);
        textView.setText("your score: " + i);
    }
}
