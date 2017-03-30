package com.harinder.pharmadtu.Customer.Hospital;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.harinder.pharmadtu.R;

import java.util.ArrayList;

public class Hospital extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Hospitals List");
        setContentView(R.layout.activity_hospital);

        String hname[] ={"  AIIMS ","  Indraprastha Apollo Hospital","  Max Superspecialty Hospital","  Sir Ganga Ram Hospital","  Medanta - The Medicity",
                "  GB Pant Hospital","  Fortis Hospital","  Dr. Ram Manohar Lohia Hospital","  BLK Super Specialty Hospital","  Batra Hospital "};
        String hspec[] ={" SPECIALISATION: Gal Bladder/Kidney Transplant/Cardiologist"," SPECIALISATION: Kidney Transplant/Cardiologist/Spine Chord Specialist"," SPECIALISATION: Cardiologist/ Spine Chord Specialist/Neurologist"," SPECIALISATION: Neurologist/Orthopedic/Liver Transplant"," SPECIALISATION: Liver Transplant/Orthopedic/Cardiologist",
                " SPECIALISATION: Autograft/Skin Specialist/Spin Chord Specialist"," SPECIALISATION: Skin Specialist/Cardiologist/Cancer"," SPECIALISATION: Spine Chord Specialist/Skin Care/Orthopedic"," SPECIALISATION: Cardiologist/Skin Care/Spine Chord Specialist"," SPECIALISATION: Orthopedic/Cardiologist/Cancer"};
        int hpin[]  ={110029,110076,110017,110060,122001,110002,201301,110001,110005,110062};
        String hcontno[] ={" Ph: 18602583010"," Ph: +91-11-29871090/1091"," Ph: +91 11 4055 4055"," Ph: +91 11-25750000"," Ph: +91 124 414 1414"," Ph: +91 11 2323 4242"," Ph: +911204300222"," Ph: 011-23365525"," Ph: +91 11 3040 3040"," Ph: 91-11-2995 8747"};

        ArrayList<HospitalObject> marray = new ArrayList<>();
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(getApplicationContext());

        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        for(int i=0;i<hname.length;i++)
        {
            marray.add(new HospitalObject(hname[i],hspec[i],hpin[i],hcontno[i]));
        }

            HospitalAdapter mHospitalAdapter  = new HospitalAdapter(marray);

            mRecyclerView.setAdapter(mHospitalAdapter);

          }

}
