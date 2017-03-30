package com.harinder.pharmadtu.Customer.Profile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.harinder.pharmadtu.R;


public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprofile);

        String layout = getIntent().getStringExtra("layout");
        if (layout.equals("seller"))
        {
            setContentView(R.layout.activity_sprofile);
        }else
        {
            setContentView(R.layout.activity_cprofile);
        }

    }
}
