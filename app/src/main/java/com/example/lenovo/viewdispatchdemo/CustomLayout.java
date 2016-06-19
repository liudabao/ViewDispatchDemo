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


    /*@Override
    public  boolean onInterceptTouchEvent(MotionEvent ev){
        return false;
    }*/

    @Override
    public boolean onTouchEvent(MotionEvent event){
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("LayoutTouch","touched down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("LayoutTouch","touched move");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("LayoutTouch","touched up");
                break;

        }

        return true;
       // return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event){
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("LayoutTouch","dispatch touched down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("LayoutTouch","dispatch touched move");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("LayoutTouch","dispatch touched up");
                break;
        }

        return super.dispatchTouchEvent(event);
    }
}
