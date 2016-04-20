package com.epicodus.bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private String[] consonantArray = new String [] {"B", "C", "D","F", "G", "H", "J", "K", "L", "M", "N", "P", "QU", "R", "S", "T", "V", "W", "X", "Y", "Z"};
    private String[] vowelArray = {"A", "E","I","O", "U"};

//    for (int i = 0; i < 6 ; i++) {
//        private String consonant(i) = consonantArray[(int)Math.floor(Math.random()*21)];
//    }




    @Bind(R.id.startButton) Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String consonant1 = consonantArray[(int)Math.floor(Math.random()*21)];
                String consonant2 = consonantArray[(int)Math.floor(Math.random()*21)];
                String consonant3 = consonantArray[(int)Math.floor(Math.random()*21)];
                String consonant4 = consonantArray[(int)Math.floor(Math.random()*21)];
                String consonant5 = consonantArray[(int)Math.floor(Math.random()*21)];
                String consonant6 = consonantArray[(int)Math.floor(Math.random()*21)];
                String vowel1 = vowelArray[(int)Math.floor(Math.random()*5)];
                String vowel2 = vowelArray[(int)Math.floor(Math.random()*5)];
                String vowel3 = vowelArray[(int)Math.floor(Math.random()*5)];

                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                intent.putExtra("consonant1", consonant1);
                intent.putExtra("consonant2", consonant2);
                intent.putExtra("consonant3", consonant3);
                intent.putExtra("consonant4", consonant4);
                intent.putExtra("consonant5", consonant5);
                intent.putExtra("consonant6", consonant6);

                intent.putExtra("vowel1", vowel1);
                intent.putExtra("vowel2", vowel2);
                intent.putExtra("vowel3", vowel3);
                startActivity(intent);
            }
        });
    }
}
