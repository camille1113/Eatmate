package com.example.zhanglanxin.Eatmate;

/**
 * Created by zhanglanxin on 4/11/17.
 */

public class Opening_hours {
    private String open_now;
    public String getOpen(){
        if(open_now.equals("true"))
        return "The restaurant is open now.";
        else return "The restaurant is closed now";
    }
}
