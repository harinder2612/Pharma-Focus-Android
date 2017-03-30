package com.harinder.pharmadtu.Customer.Blood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.harinder.pharmadtu.R;

import java.util.ArrayList;

public class Blood extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_blood);

        String [] pname = {"Dil Kapoor","Kunal Sharma","Manish Jumle","Vikram Sharma","Varun Surya",
                "Vishant","Varsha","Vivek Rawat","Deepak Duggal","Vikas Chauhan","Piyush Pachori","Vishesh Sagar","Ramesh Kumar Jain","Pooja Sethi","Dusmanta Nayak"};
        String [] phno={"Ph: 9810383305","Ph: 9911090955","Ph: 7053029216","Ph: 9717709787","Ph: 9910308217","Ph: 9958893461","Ph: 9999106564","Ph: 8527063021","Ph: 9910026715","Ph: 9999597059","Ph: 9654758509","Ph: 9999991434","Ph: 9910350461","Ph: 9868091610","Ph: " +
                "9250079218"};
        String [] btype = {"Blood Group: O+","Blood Group: AB-","Blood Group: AB+","Blood Group: A+","Blood Group: A+","Blood Group: AB-","Blood Group: B-","Blood Group: AB+","Blood Group: O-","Blood Group: O+","Blood Group: A1B+","Blood Group: AB-","Blood Group: B-","Blood Group: A1B-","Blood Group: A+"};
        String[] pincode ={"110059","110058","110058","110059","110058","110056","110059","110058","110059","110060","110059","110060","110059","110058","110060"};


        ArrayList<BloodObject> marray = new ArrayList<>();
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_viewblood);
        LinearLayoutManager mlLinearLayoutManager = new LinearLayoutManager(getApplicationContext());

        mRecyclerView.setLayoutManager(mlLinearLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        for(int i=0;i<pname.length;i++)
        {
            marray.add(new BloodObject(pname[i],phno[i],pincode[i],btype[i]));

        }

        BloodAdapter mBloodAdapter  = new BloodAdapter(marray);

        mRecyclerView.setAdapter(mBloodAdapter);


    }
}
