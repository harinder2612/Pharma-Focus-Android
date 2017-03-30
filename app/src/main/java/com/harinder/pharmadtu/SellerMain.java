package com.harinder.pharmadtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.harinder.pharmadtu.Customer.News.News;
import com.harinder.pharmadtu.Customer.Profile.About;

public class SellerMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_main);
    }

    public void home(View view)
    {Intent i= new Intent(this,SellerMainActivity.class);
    startActivity(i);
    }

    public void news (View view)
    {Intent i= new Intent(this, News.class);
        startActivity(i);}


    public void profile (View view)
    {Intent i= new Intent(this,About.class);
        i.putExtra("layout","seller");
        startActivity(i);}

}
