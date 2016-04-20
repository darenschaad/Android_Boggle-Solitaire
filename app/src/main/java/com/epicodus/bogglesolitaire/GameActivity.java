package com.epicodus.bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class GameActivity extends AppCompatActivity {
    public static final String TAG = GameActivity.class.getSimpleName();

    @Bind(R.id.letter1) TextView mLetter1;
    @Bind(R.id.letter2) TextView mLetter2;
    @Bind(R.id.letter3) TextView mLetter3;
    @Bind(R.id.letter4) TextView mLetter4;
    @Bind(R.id.letter5) TextView mLetter5;
    @Bind(R.id.letter6) TextView mLetter6;
    @Bind(R.id.letter7) TextView mLetter7;
    @Bind(R.id.letter8) TextView mLetter8;
    @Bind(R.id.letter9) TextView mLetter9;
    @Bind(R.id.tvWordView) TextView mTVWordView;
    @Bind(R.id.submitButton) Button mSubmitButton;
    @Bind(R.id.getScoreButton) Button mGetScoreButton;
    ArrayList<String> enteredWordArray = new ArrayList<String>();

//    @Bind(R.id.letter4) TextView mLetter4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        final String consonant1 = intent.getStringExtra("consonant1");
        final String consonant2 = intent.getStringExtra("consonant2");
        final String consonant3 = intent.getStringExtra("consonant3");
        final String consonant4 = intent.getStringExtra("consonant4");
        final String consonant5 = intent.getStringExtra("consonant5");
        final String consonant6 = intent.getStringExtra("consonant6");
        final String vowel1 = intent.getStringExtra("vowel1");
        final String vowel2 = intent.getStringExtra("vowel2");
        final String vowel3 = intent.getStringExtra("vowel3");

        mLetter1.setText(consonant1);
        mLetter2.setText(vowel1);
        mLetter3.setText(consonant2);
        mLetter4.setText(consonant3);
        mLetter6.setText(vowel2);
        mLetter5.setText(consonant4);
        mLetter7.setText(consonant5);
        mLetter9.setText(vowel3);
        mLetter8.setText(consonant6);

        mLetter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTVWordView.append(consonant1);
                mLetter1.setVisibility(View.INVISIBLE);
            }
        });
        mLetter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTVWordView.append(vowel1);
                mLetter2.setVisibility(View.INVISIBLE);
            }
        });
        mLetter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTVWordView.append(consonant2);
                mLetter3.setVisibility(View.INVISIBLE);
            }
        });
        mLetter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTVWordView.append(consonant3);
                mLetter4.setVisibility(View.INVISIBLE);
            }
        });
        mLetter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTVWordView.append(consonant4);
                mLetter5.setVisibility(View.INVISIBLE);
            }
        });
        mLetter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTVWordView.append(vowel2);
                mLetter6.setVisibility(View.INVISIBLE);
            }
        });
        mLetter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTVWordView.append(consonant5);
                mLetter7.setVisibility(View.INVISIBLE);
            }
        });
        mLetter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTVWordView.append(consonant6);
                mLetter8.setVisibility(View.INVISIBLE);
            }
        });
        mLetter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTVWordView.append(vowel3);
                mLetter9.setVisibility(View.INVISIBLE);
            }
        });
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredWord = mTVWordView.getText().toString();
                if (enteredWord.length() > 2) {
                    enteredWordArray.add(enteredWord);
                }mTVWordView.setText("");
                for (String i : enteredWordArray){
                    Log.d(TAG, i);
                }
                mLetter1.setVisibility(View.VISIBLE);
                mLetter2.setVisibility(View.VISIBLE);
                mLetter3.setVisibility(View.VISIBLE);
                mLetter4.setVisibility(View.VISIBLE);
                mLetter5.setVisibility(View.VISIBLE);
                mLetter6.setVisibility(View.VISIBLE);
                mLetter7.setVisibility(View.VISIBLE);
                mLetter8.setVisibility(View.VISIBLE);
                mLetter9.setVisibility(View.VISIBLE);
            }
        });
        mGetScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameActivity.this, ScoreActivity.class);
                intent.putStringArrayListExtra("enteredWordArray", enteredWordArray);
                startActivity(intent);
            }
        });

    }
}
