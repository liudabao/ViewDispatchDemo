package com.example.lenovo.viewdispatchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by lenovo on 2016/5/24.
 */
public class CustomLayout extends LinearLayout {


    public CustomLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomLayout(Context context) {
        super(context);
    }


    @Override
    public  boolean onInterceptTouchEvent(MotionEvent ev){
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        Log.e("LayoutTouch","touched");
        return true;
    }

}
