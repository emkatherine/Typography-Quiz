package com.example.mkreh.designquiz_type;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;
import android.widget.EditText;
import android.text.Editable;

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

    /**
     * Correct answers for the radio button questions
     */

    public void q1rg() {
        RadioButton tittleButton = (RadioButton) findViewById(R.id.tittle);
        tittleButton.isSelected();
        boolean selected = ((RadioButton) tittleButton).isSelected();

        if (selected) {
            i = i + 1;
        } else {
            i = i + 0;
        }
    }

    public void q2rg() {
        RadioButton leadingButton = (RadioButton) findViewById(R.id.leading);
        leadingButton.isSelected();
        boolean selected = ((RadioButton) leadingButton).isSelected();

        if (selected) {
            i = i + 1;
        } else {
            i = i + 0;
        }
    }

    public void q3rg() {
        RadioButton trueButton = (RadioButton) findViewById(R.id.threeTrue);
        trueButton.isSelected();
        boolean selected = ((RadioButton) trueButton).isSelected();

        if (selected) {
            i = i + 1;
        } else {
            i = i + 0;
        }
    }

    public void q5rg() {
        RadioButton letterpressButton = (RadioButton) findViewById(R.id.letterpress);
        letterpressButton.isSelected();
        boolean selected = ((RadioButton) letterpressButton).isSelected();

        if (selected) {
            i = i + 1;
        } else {
            i = i + 0;
        }
    }

    public void q7rg() {
        RadioButton ligatureButton = (RadioButton) findViewById(R.id.ligature);
        ligatureButton.isSelected();
        boolean selected = ((RadioButton) ligatureButton).isSelected();

        if (selected) {
            i = i + 1;
        } else {
            i = i + 0;
        }
    }

    public void q8rg() {
        RadioButton xheightButton = (RadioButton) findViewById(R.id.xHeight);
        xheightButton.isSelected();
        boolean selected = ((RadioButton) xheightButton).isSelected();

        if (selected) {
            i = i + 1;
        } else {
            i = i + 0;
        }
    }

    /**
     * Correct answer for number 6, the edit text question
     */

    public void q6et(TextView textView) {
        EditText q6etText = (EditText) findViewById(R.id.q6et);
        q6etText.isSelected();
        String correct = "baseline";
        if (correct == "baseline") {
            i = i + 1;
        } else {
            i = i + 0;
        }
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

        if (fourFuturaCB.isChecked() && fourFranklinGothicCB.isChecked() && fourUbuntuCB.isChecked()) {
            i = i + 1;
        } else {
            i = i + 0;
        }
    }

    public void getScore(View view) {
        TextView textView = (TextView) findViewById(R.id.score);
        textView.setText("your score: " + i);
    }
}