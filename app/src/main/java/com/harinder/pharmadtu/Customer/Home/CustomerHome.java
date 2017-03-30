package com.harinder.pharmadtu.Customer.Home;


public class CustomerHome
{
    private String mtitle;
    private int mImageResourceId;

    public CustomerHome(String mtitle, int mImageResourceId) {
        this.mtitle = mtitle;
        this.mImageResourceId = mImageResourceId;
    }

    public String getMtitle() {
        return mtitle;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
