package com.harinder.pharmadtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.harinder.pharmadtu.Customer.Blood.Blood;
import com.harinder.pharmadtu.Customer.Home.Home;
import com.harinder.pharmadtu.Customer.Hospital.Hospital;
import com.harinder.pharmadtu.Customer.News.News;
import com.harinder.pharmadtu.Customer.Profile.About;

public class CustomerMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_main);

        LinearLayout home = (LinearLayout) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomerMain.this , Home.class));

            }
        });
    }
    public void blood(View v)
    {
        startActivity(new Intent(CustomerMain.this, Blood.class));
    }
    public void hospital(View v)
    {
        startActivity(new Intent(CustomerMain.this , Hospital.class));
    }
    public void news(View v)
    {
        startActivity(new Intent(CustomerMain.this , News.class));
    }
    public void profile(View v)
    {
        Intent a = new Intent(CustomerMain.this , About.class);
        a.putExtra("layout","customer");
        startActivity(a);

    }

}
