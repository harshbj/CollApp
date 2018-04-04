package com.example.harsh.homedashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.app.Activity;
import android.widget.ImageView;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }
    public void goToSo (View view){
        goToUrl("https://vcet.edu.in/contactdetails15/");
    }
    public void goToSu (View view){
        goToUrl("https://www.facebook.com/vcetvasai/");
    }
    public void goToSi (View view){
        goToUrl("https://www.instagram.com/avahan_vcet2018/");
    }
    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);

    }
}
