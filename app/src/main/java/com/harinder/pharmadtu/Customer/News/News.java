package com.harinder.pharmadtu.Customer.News;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.harinder.pharmadtu.R;

import java.util.ArrayList;

public class News extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        Integer  imgID[]={R.drawable.malaria,R.drawable.seven_ways_to_get_fit,R.drawable.cigratte,R.drawable.antibiotic_resistance,R.drawable.fast_food,R.drawable.brain,R.drawable.leukemia};
        String title[]={"Malaria strikes back","Seven Ways to get Fit","E-Cigrattes dafe","Antibiotic Resistance","Fast Food packaging","Brian Reading","Leukemia"};

        String text[]={"The disesase caused by malaria recently increases gradually.","People with diabetes are prone to eye problems.",
                "A young child with asthma has a greater risk of obesity.","Flu activity continues to rise across the India.","A woman's blood-pressure level before conception.","It can tell whether a completely paralyzed person is thinking.","It’s a promising approach, but still needs a lot more research"};

        ArrayList<NewsObject> mArray = new ArrayList<NewsObject>();
        RecyclerView mRecyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager mlLinearLayoutManager = new LinearLayoutManager(getApplicationContext());

        mRecyclerView.setLayoutManager(mlLinearLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        for(int i=0;i<title.length;i++)
        {
            mArray.add(new NewsObject(imgID[i],title[i],text[i]));
        }
        NewsAdapter mNewsAdapter  = new NewsAdapter(mArray);

        mRecyclerView.setAdapter(mNewsAdapter);

    }
}
