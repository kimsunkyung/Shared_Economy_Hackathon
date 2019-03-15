package com.example.user.hanzip;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.preference.PreferenceManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    SharedPreferences mPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


           }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public void onClick(View v) {
        int position = 0;

        switch (v.getId()){


        }

    }


}
