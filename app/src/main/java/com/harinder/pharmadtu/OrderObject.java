package com.harinder.pharmadtu;


public class OrderObject {
    private String orderid,productid, proname,custname,address,cell;
    private int itemno;
    private float amt;

    public OrderObject()
    {

    }
    public OrderObject(String orderid, String productid, String proname, String custname, String address, String cell, int itemno, float amt) {
        this.orderid = orderid;
        this.productid = productid;
        this.proname = proname;
        this.custname = custname;
        this.address = address;
        this.cell = cell;
        this.itemno = itemno;
        this.amt = amt;
    }

    public OrderObject(String cust_name , String prod_id , String order_id , int quantity)
    {
        custname =  cust_name;
        productid = prod_id;
        orderid = order_id;
        itemno = quantity;
    }

    public String getOrderid() {
        return orderid;
    }

    public String getProductid() {
        return productid;
    }

    public String getProname() {
        return proname;
    }

    public String getCustname() {
        return custname;
    }

    public String getAddress() {
        return address;
    }

    public String getCell() {
        return cell;
    }

    public int getItemno() {
        return itemno;
    }

    public float getAmt() {
        return amt;
    }
}

