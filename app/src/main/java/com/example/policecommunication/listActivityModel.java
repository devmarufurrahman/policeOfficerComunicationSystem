package com.example.policecommunication;

public class listActivityModel {
    int activityImage;
    String activityTitleArray;
    String activityDesc;
    String activityLocation;
    String activityLog;


    public listActivityModel(int activityImage, String activityTitleArray, String activityDesc, String activityLocation, String activityLog){
        this.activityImage = activityImage;
        this.activityTitleArray = activityTitleArray;
        this.activityDesc = activityDesc;
        this.activityLocation = activityLocation;
        this.activityLog = activityLog;
    }

    public int getActivityImage() {
        return activityImage;
    }

    public void setActivityImage(int activityImage) {
        this.activityImage = activityImage;
    }

    public String getActivityTitleArray() {
        return activityTitleArray;
    }

    public void setActivityTitleArray(String activityTitleArray) {
        this.activityTitleArray = activityTitleArray;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public String getActivityLocation() {
        return activityLocation;
    }

    public void setActivityLocation(String activityLocation) {
        this.activityLocation = activityLocation;
    }

    public String getActivityLog() {
        return activityLog;
    }

    public void setActivityLog(String activityLog) {
        this.activityLog = activityLog;
    }



}
