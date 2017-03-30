package com.harinder.pharmadtu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ProductList extends AppCompatActivity {
    String [] pname;
    String [] price;

    private String[] firstAidName = {
            "TRAVEL FIRST AID KIT SMALL" ,
            "MILTON MEDICAL BOX" ,
            "FIRST AID PLASTIC BOX" ,
            "DERMATOLICA SKIN HEALTH HEROES",
            "Nutricharge Daily Health Supplement for Women" ,
            "REVITAL H DAILY HEALTH SUPPLEMENT" ,
            "Amway Nutrilite Daily" ,
            "Dettol Multiuse Hygiene Liquid" ,
            "Tcp Antiseptic Liquid " ,
            " Hibiclens Skin Liquid Soap" ,
            "New-Skin Liquid Bandage Spray Antiseptic" ,
            "Fluid Ounce " ,
            "First Aid Manual" ,
            "Vega Scissor Set" };
    private String[] firstAidCost = {
            "80.00" ,
            "186.00" ,
            "350.00" ,
            "1300" ,
            "995" ,
            "500" ,
            "565" ,
            "1220" ,
            "65" ,
            "95" ,
            "366" ,
            " 66" ,
            "66" ,
            "455"};
    private String[] nutritionName={"Optimum Nutrition",
            "Ultimate Nutrition Prostar" ,
            "Nutrition",
            "WATERMELON TEQUILA",
            "Zenith Nutrition Biot",
            "Horlicks",
            "Complan",
            "Bournvita",
            "Proteinx",
            "Afresh Herba Life",
            "WATERMELON TEQUILA",
            "Zenith Nutrition Biot",
            "Horlicks",};
    private String [] nutritionCos={
            "5000",
            "4998",
            "4500",
            "500",
            "180",
            "250",
            "120",
            "350",
            "3988",
            "95" ,
            "366" ,
            " 66" ,
            "66" ,
            "455"};
    private String [] babycareName={"Herbals Babycare",
            "Herbals Baby Lotion ",
            "Gentle Baby Wipes",
            "Babycare Gift Pack",
            "Toddler Mattress",
            "Herbals Baby Powder",
            "baby skincare Wipes",
            "Socks",
            "Baby Sleeping Bag",
            "Baby Shower Cap",
            "Gentle Baby Soap",
            "Mamy Poko Pants",
            "Pampers New Baby Diapers",
            "baby skincare Wipes"};
    private String[] babycareCos = {
            "80.00" ,
            "186.00" ,
            "350.00" ,
            "1300" ,
            "995" ,
            "500" ,
            "565" ,
            "1220" ,
            "65" ,
            "95" ,
            "366" ,
            " 66" ,
            "66" ,
            "455"};
    private  String[] bodycareName={"skin whitening cream",
            "skin brightening gel",
            "auravedic brightening cream",
            "auravedic whitening cream",
            "mederma skin care",
            "VLCC Gold facial kit",
            "Himalaya facial kit",
            "Bio care papaya gel",
            "Scrub",
            "Cleanser",
            "Burgundy Henna",
            "Streax Pro Hair",
            "TRESemme",
            "L'Oreal"};

    private String[] bodycareCos = {
            "80.00" ,
            "186.00" ,
            "350.00" ,
            "1300" ,
            "995" ,
            "500" ,
            "565" ,
            "1220" ,
            "65" ,
            "95" ,
            "366" ,
            " 66" ,
            "66" ,
            "455"};

    private String [] dailyuseName={"Amoxycillin","Ampicillin","Cefadroxyl","Cephalexin","Cloxacillin","Phazyme","Simethicone","Vitamin A","Vitamin B complex","Vitamin C","Vitamin D" ,"Vitamin E","Vitamin K","albutamol"};


    private RecyclerView mRecyclerView;
    private ArrayList<ProductListObject> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        mList = new ArrayList<>();

        String type = getIntent().getStringExtra("type");
        switch (type)
        {
            case "medicine":
                break;
            case "dailyUse":
                for (int i =0 ; i<dailyuseName.length ; i++)
                {
                    mList.add(new ProductListObject(dailyuseName[i],babycareCos[i]));
                }
                break;
            case "nutrition":
                for (int i=0 ; i<nutritionName.length;i++)
                {
                    mList.add(new ProductListObject(nutritionName[i],nutritionCos[i]));
                }
                break;
            case "bodyCare":

                for (int i=0 ; i<bodycareName.length;i++)
                {
                    mList.add(new ProductListObject(bodycareName[i],babycareCos[i]));
                }
                break;
            case "babyCare":

                for (int i=0 ; i<babycareCos.length;i++)
                {
                    mList.add(new ProductListObject(babycareName[i],babycareCos[i]));
                }
                break;
            case "firstAid":

                for (int i=0 ; i<firstAidCost.length;i++)
                {
                    mList.add(new ProductListObject(firstAidName[i],firstAidCost[i]));
                }
                break;
            case "default":
                break;
        }

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView_product_list);
        LinearLayoutManager mlLinearLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mlLinearLayoutManager);


        ProductListAdapter mAdapter  = new ProductListAdapter(mList);

        mRecyclerView.setAdapter(mAdapter);


    }





}
