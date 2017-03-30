package com.harinder.pharmadtu.Customer.Blood;


public class BloodObject {

    String mname,mphnno,mpincode,btype;

    public BloodObject(String mname, String mphnno, String mpincode,String btype) {
        this.mname = mname;
        this.mphnno = mphnno;
        this.mpincode = mpincode;
        this.btype = btype;
    }

    public String getBtype() {
        return btype;
    }

    public String getMname() {
        return mname;
    }

    public String getMphnno() {
        return mphnno;
    }

    public String getMpincode() {
        return mpincode;
    }
}

