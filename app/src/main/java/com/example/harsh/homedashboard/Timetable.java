package com.example.harsh.homedashboard;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Timetable extends AppCompatActivity implements View.OnClickListener{
    private CardView fycard,sycard,tycard,ftycard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        fycard = (CardView) findViewById(R.id.Cfirst);
        sycard = (CardView) findViewById(R.id.Csecond);
        tycard = (CardView) findViewById(R.id.Cthird);
        ftycard = (CardView) findViewById(R.id.Cforth);


        fycard.setOnClickListener(this);
        sycard.setOnClickListener(this);
        tycard.setOnClickListener(this);
        ftycard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.Cfirst :
                i = new Intent(this,MainActivity.class);
                startActivity(i);
                break;
            case R.id.Csecond :
                i = new Intent(this,Selection.class);
                startActivity(i);
                break;
            case R.id.Cthird :
                i = new Intent(this,MainActivity.class);
                startActivity(i);
                break;
            case R.id.Cforth :
                i = new Intent(this,MainActivity.class);
                startActivity(i);
                break;
                default:break;
        }

    }
}
