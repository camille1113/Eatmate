package com.example.zhanglanxin.Eatmate;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by zhanglanxin on 4/11/17.
 */

public class Restaurant implements Parcelable{
    private String vicinity;
    private String name;
    private String rating;
    private Opening_hours opening_hours;
    private Photo[] photos;

    public String getVicinity() {
        return vicinity;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public Opening_hours getOpening_hours() {
        return opening_hours;
    }

    public Photo[] getPhoto(){
        return photos;
    }

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.vicinity);
        dest.writeString(this.name);
        dest.writeString(this.rating);
        
    }

    public Restaurant() {
    }

    protected Restaurant(Parcel in) {
        this.vicinity = in.readString();
        this.name = in.readString();
        this.rating = in.readString();
    }

    public static final Creator<Restaurant> CREATOR = new Creator<Restaurant>() {
        @Override
        public Restaurant createFromParcel(Parcel in) {
            return new Restaurant(in);
        }

        @Override
        public Restaurant[] newArray(int size) {
            return new Restaurant[size];
        }
    };
}
