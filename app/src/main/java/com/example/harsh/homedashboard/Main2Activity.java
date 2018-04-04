package com.example.harsh.homedashboard;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    TabLayout MyTabs1;
    ViewPager MyPage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MyTabs1 = (TabLayout)findViewById(R.id.MyTabs1);
        MyPage1 = (ViewPager)findViewById(R.id.MyPage1);

        MyTabs1.setupWithViewPager(MyPage1);
        SetUpViewPager(MyPage1);

    }

    public void SetUpViewPager (ViewPager viewpage){
        Main2Activity.MyViewPageAdapter Adapter = new Main2Activity.MyViewPageAdapter(getSupportFragmentManager());

        Adapter.AddFragmentPage(new Page_4(), "SEM 3");
        Adapter.AddFragmentPage(new Page_5(), "SEM 4");
        Adapter.AddFragmentPage(new Page_6(),"EXAM TIMETABLE");

        //We Need Fragment class now

        viewpage.setAdapter(Adapter);

    }

    public class MyViewPageAdapter extends FragmentPagerAdapter{
        private List<Fragment> MyFragment1 = new ArrayList<>();
        private List<String> MyPageTittle1 = new ArrayList<>();

        public MyViewPageAdapter(FragmentManager manager){
            super(manager);
        }

        public void AddFragmentPage(Fragment Frag, String Title){
            MyFragment1.add(Frag);
            MyPageTittle1.add(Title);
        }

        @Override
        public Fragment getItem(int position) {
            return MyFragment1.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return MyPageTittle1.get(position);
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings1) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}