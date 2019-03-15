package com.example.android.italianquiz;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Question 1
         */
        TextView question1 = findViewById(R.id.question1);
        question1.setText(getString(R.string.question1));

        RadioButton box11 = findViewById(R.id.box11);
        box11.setText(getString(R.string.answer11));

        RadioButton box12 = findViewById(R.id.box12);
        box12.setText(getString(R.string.answer12));

        RadioButton box13 = findViewById(R.id.box13);
        box13.setText(getString(R.string.answer13));

        RadioButton box14 = findViewById(R.id.box14);
        box14.setText(getString(R.string.answer14));

        /**
         * Question 2
         */
        TextView question2 = findViewById(R.id.question2);
        question2.setText(getString(R.string.question2));

        RadioButton box21 = findViewById(R.id.box21);
        box21.setText(getString(R.string.answer21));

        RadioButton box22 = findViewById(R.id.box22);
        box22.setText(getString(R.string.answer22));

        RadioButton box23 = findViewById(R.id.box23);
        box23.setText(getString(R.string.answer23));

        RadioButton box24 = findViewById(R.id.box24);
        box24.setText(getString(R.string.answer24));

        /**
         * Question 3
         */
        TextView question3 = findViewById(R.id.question3);
        question3.setText(getString(R.string.question3));

        CheckBox box31 = findViewById(R.id.box31);
        box31.setText(getString(R.string.answer31));

        CheckBox box32 = findViewById(R.id.box32);
        box32.setText(getString(R.string.answer32));

        CheckBox box33 = findViewById(R.id.box33);
        box33.setText(getString(R.string.answer33));

        CheckBox box34 = findViewById(R.id.box34);
        box34.setText(getString(R.string.answer34));

        /**
         * Question 4
         */
        TextView question4 = findViewById(R.id.question4);
        question4.setText(getString(R.string.question4));

        RadioButton box41 = findViewById(R.id.box41);
        box41.setText(getString(R.string.answer41));

        RadioButton box42 = findViewById(R.id.box42);
        box42.setText(getString(R.string.answer42));

        RadioButton box43 = findViewById(R.id.box43);
        box43.setText(getString(R.string.answer43));

        RadioButton box44 = findViewById(R.id.box44);
        box44.setText(getString(R.string.answer44));

    }

    public void submitAnswers(View v){
        this.setScore(0);

        RadioButton box14 = findViewById(R.id.box14);
        if(box14.isChecked()){
            this.setScore(this.getScore() + 1);
        }

        RadioButton box23 = findViewById(R.id.box23);
        if(box23.isChecked()){
            this.setScore(this.getScore() + 1);
        }

        CheckBox box31 = findViewById(R.id.box31);
        CheckBox box32 = findViewById(R.id.box32);
        CheckBox box33 = findViewById(R.id.box33);
        CheckBox box34 = findViewById(R.id.box34);

        if(box33.isChecked() && box34.isChecked() && !(box31.isChecked()) && !(box32.isChecked())){
            this.setScore(this.getScore() + 1);
        }

        RadioButton box43 = findViewById(R.id.box43);
        if(box43.isChecked()){
            this.setScore(this.getScore() + 1);
        }

        String text = "You have guessed " + this.getScore() + " answers";
        Toast.makeText(getApplicationContext(), text , Toast.LENGTH_LONG).show();
    }
}
