package com.harinder.pharmadtu.Customer.News;


public class NewsObject {
    String title,text;
    Integer imgID;
    public NewsObject(Integer imgID,String title, String text) {

        this.title = title;
        this.text = text;
        this.imgID=imgID;
    }



    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public Integer getImgID(){return imgID;}
}
