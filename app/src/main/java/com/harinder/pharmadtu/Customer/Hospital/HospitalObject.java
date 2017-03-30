package com.harinder.pharmadtu.Customer.Hospital;


public class HospitalObject {

    String mname,mspecialist;
    int mpincode;
            String mcontno;

    public HospitalObject(String mname, String mspecialist, int mpincode, String mcontno) {
        this.mname = mname;
        this.mspecialist = mspecialist;
        this.mpincode=mpincode;
        this.mcontno = mcontno;
    }

    public String getMcontno() {
        return mcontno;
    }

    public int getMpincode() {
        return mpincode;
    }

    public String getMname() {
        return mname;
    }

    public String getMspecialist() {
        return mspecialist;
    }
}
