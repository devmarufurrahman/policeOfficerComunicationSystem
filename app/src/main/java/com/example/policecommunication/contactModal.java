package com.example.policecommunication;

public class contactModal {
    int img;
    String title;
    String desc;
    String location;
    String log ;

    public contactModal(int img, String title, String desc, String location,  String log) {
        this.img = img;
        this.title = title;
        this.desc = desc;
        this.location = location;
        this.log = log;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
