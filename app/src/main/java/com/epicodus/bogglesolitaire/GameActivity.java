package com.epicodus.bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class GameActivity extends AppCompatActivity {

    @Bind(R.id.letter1) TextView mLetter1;
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
        String vowel1 = intent.getStringExtra("vowel1");
        String vowel2 = intent.getStringExtra("vowel2");
        String vowel3 = intent.getStringExtra("vowel3");

        mLetter1.setText(consonant1 + vowel1);
    }
}
