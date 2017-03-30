package com.harinder.pharmadtu.Customer.Home;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.harinder.pharmadtu.MainActivity;
import com.harinder.pharmadtu.PrescriptionActivity;
import com.harinder.pharmadtu.ProductList;
import com.harinder.pharmadtu.R;
import com.harinder.pharmadtu.RecyclerItemClickListener;

import java.util.ArrayList;


public class Home extends AppCompatActivity {

    FloatingActionMenu fabMenu;
    FloatingActionButton fab_search, fab_traker, fab_cart, fab_symptoms, fab_refils, fab_remainder;
    RecyclerView recyclerView;
    private ArrayList<CustomerHome> mList;
    private CustomerHomePageAdapter mAdapter;


    private String[] title = {"Order Medicines" , "Baby Care" , "Nutrition" , "Body Care" , "Daily Use", "First Aid"};
    private int[] imageResourceId = {R.drawable.ic_presription,
            R.drawable.ic_baby ,
            R.drawable.ic_nutrition,
            R.drawable.ic_cosmetics,
            R.drawable.ic_daily_use ,
            R.drawable.ic_firstaid

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);



        mList = new ArrayList<>();
        for(int i = 0 ; i<title.length ; i++)
        {
            mList.add(new CustomerHome(title[i],imageResourceId[i]));
        }


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new CustomerHomePageAdapter(this , mList);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new MainActivity.GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setAdapter(mAdapter);


        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener
                .OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                //handle click events here
                CustomerHome item = mList.get(position);
                Intent i;
                i = new Intent(Home.this , ProductList.class);
                switch (item.getMtitle())
                {

                    case "Order Medicines" :
                        startActivity(new Intent(Home.this , PrescriptionActivity.class));
                        break;
                    case "Daily Use" :
                        i.putExtra("type","dailyUse");
                        startActivity(i);
                        break;
                      case "Nutrition" :
                        i.putExtra("type","nutrition");
                          startActivity(i);

                          break;
                    case "Body Care":
                        i.putExtra("type","bodyCare");
                        startActivity(i);

                        break;
                    case "Baby Care":
                        i.putExtra("type","babyCare");
                        startActivity(i);
                        break;
                    case "First Aid":
                        i.putExtra("type","firstAid");
                        startActivity(i);
                        break;
                    default:
                        i.putExtra("type","default");
                        startActivity(i);
                        break;
                }
            }

            @Override
            public void onItemLongClick(View view, int position) {
                //handle longClick if any
            }
        }));



        fabMenu = (FloatingActionMenu) findViewById(R.id.fab_menu);

        fab_search = (FloatingActionButton) findViewById(R.id.fab_search);
        fab_traker = (FloatingActionButton) findViewById(R.id.fab_health_tracker);
        fab_cart = (FloatingActionButton) findViewById(R.id.fab_cart);
        fab_symptoms = (FloatingActionButton) findViewById(R.id.fab_symptoms);
        fab_refils = (FloatingActionButton) findViewById(R.id.fab_refils);
        fab_remainder = (FloatingActionButton) findViewById(R.id.fab_remainder);

        fab_remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Remainder Feature coming soon", Toast.LENGTH_SHORT).show();

            }
        });

        fab_refils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Refils Feature coming soon", Toast.LENGTH_SHORT).show();

            }
        });

        fab_symptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Symptoms checker Feature coming soon", Toast.LENGTH_SHORT).show();

            }
        });

        fab_traker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Health Tracker Feature coming soon", Toast.LENGTH_SHORT).show();

            }
        });

        fab_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Cart Feature coming soon", Toast.LENGTH_SHORT).show();

            }
        });

        fab_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Search Feature coming soon", Toast.LENGTH_SHORT).show();

            }
        });


    }

    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

}
