package com.epicodus.bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class GameActivity extends AppCompatActivity {

    @Bind(R.id.letter1) TextView mLetter1;
    @Bind(R.id.letter2) TextView mLetter2;
    @Bind(R.id.letter3) TextView mLetter3;
    @Bind(R.id.letter4) TextView mLetter4;
    @Bind(R.id.letter5) TextView mLetter5;
    @Bind(R.id.letter6) TextView mLetter6;
    @Bind(R.id.letter7) TextView mLetter7;
    @Bind(R.id.letter8) TextView mLetter8;
    @Bind(R.id.letter9) TextView mLetter9;

//    @Bind(R.id.letter4) TextView mLetter4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String consonant1 = intent.getStringExtra("consonant1");
        String consonant2 = intent.getStringExtra("consonant2");
        String consonant3 = intent.getStringExtra("consonant3");
        String consonant4 = intent.getStringExtra("consonant4");
        String consonant5 = intent.getStringExtra("consonant5");
        String consonant6 = intent.getStringExtra("consonant6");
        String vowel1 = intent.getStringExtra("vowel1");
        String vowel2 = intent.getStringExtra("vowel2");
        String vowel3 = intent.getStringExtra("vowel3");

        mLetter1.setText(consonant1);
        mLetter2.setText(vowel1);
        mLetter3.setText(consonant2);
        mLetter4.setText(consonant3);
        mLetter6.setText(vowel2);
        mLetter5.setText(consonant4);
        mLetter7.setText(consonant5);
        mLetter9.setText(vowel3);
        mLetter8.setText(consonant6);



    }
}
