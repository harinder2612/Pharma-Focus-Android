package com.harinder.pharmadtu;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SellerMainActivity extends AppCompatActivity {


    static int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_seller);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment sellerFrag = new SellerMainFragment();
        fragmentTransaction.add(R.id.frag_container,sellerFrag,"hey");
        fragmentTransaction.commit();



    }


}
