package com.limox.jesus.phonerecord.Model;

/**
 * Created by usuario on 10/02/17.
 */

public class Record {
    private String mNumber;
    private String mType;
    private String mDuration;

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        this.mNumber = number;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        this.mType = type;
    }

    public String getDuration() {
        return mDuration;
    }

    public void setDuration(String duration) {
        this.mDuration = duration;
    }
}
