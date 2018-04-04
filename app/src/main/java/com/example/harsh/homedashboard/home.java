package com.example.harsh.homedashboard;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutCompat;
import android.transition.Explode;
import android.view.View;
import android.view.Window;


public class home extends AppCompatActivity implements View.OnClickListener {
    private CardView facultycard,timetablecard,calendercard,railwaycard,noticecard,contactuscard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        facultycard = (CardView) findViewById(R.id.Cfaculty);
        timetablecard = (CardView) findViewById(R.id.Ctimetable);
        calendercard = (CardView) findViewById(R.id.Ccalender);
        railwaycard = (CardView) findViewById(R.id.Crailway);
        noticecard = (CardView) findViewById(R.id.Cnotice);
        contactuscard = (CardView) findViewById(R.id.Ccontactus);


        facultycard.setOnClickListener(this);
        timetablecard.setOnClickListener(this);
        calendercard.setOnClickListener(this);
        railwaycard.setOnClickListener(this);
        noticecard.setOnClickListener(this);
        contactuscard.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {

        Intent i;


        switch (v.getId()) {
            case R.id.Cfaculty:
                i = new Intent(this, Faculty.class);
                startActivity(i);
                break;
            case R.id.Ctimetable:
                i = new Intent(this, Timetable.class);
                startActivity(i);
                break;
            case R.id.Ccalender:
                i = new Intent(this, Calender.class);
                startActivity(i);
                break;
            case R.id.Crailway:
                i = new Intent(this, Railway.class);
                startActivity(i);
                break;
            case R.id.Cnotice:
                i = new Intent(this, Notice.class);
                startActivity(i);
                break;
            case R.id.Ccontactus:
                i = new Intent(this, ContactUs.class);
                startActivity(i);
                break;
            default:
                break;

        }
    }
}
