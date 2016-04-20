package com.epicodus.bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ScoreActivity extends AppCompatActivity {

    @Bind(R.id.tvScore) TextView mTVScore;
    @Bind(R.id.lvWords) ListView mLVWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        ArrayList<String> scoreList= intent.getStringArrayListExtra("enteredWordArray");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, scoreList);
        mLVWords.setAdapter(adapter);

//        mLVWords.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String word = ((TextView)view).getText().toString();
//                Toast.makeText(ScoreActivity.this, word, Toast.LENGTH_LONG).show();
//            }
//        });
    }
}
