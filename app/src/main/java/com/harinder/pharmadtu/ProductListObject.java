package com.harinder.pharmadtu;

public class ProductListObject {
String product,price,quantity;

    public ProductListObject(String product, String price) {
        this.product = product;
        this.price = price;
        this.quantity=quantity;

    }

    public String getPrice() {
        return price;
    }

    public String getProduct() {
        return product;
    }

    public String getQuantity(){return quantity;}
}
