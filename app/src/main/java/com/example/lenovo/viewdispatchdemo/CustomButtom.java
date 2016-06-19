package com.example.lenovo.viewdispatchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by lenovo on 2016/5/24.
 */
public class CustomButtom extends Button {
    public CustomButtom(Context context) {
        super(context);
    }

    public CustomButtom(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomButtom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("ButtonTouch","touched down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("ButtonTouch","touched move");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("ButtonTouch","touched up");
                break;
        }

       return super.onTouchEvent(event);
       // return  true;
      //  return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event){
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("ButtonTouch","dispatch touched down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("ButtonTouch","dispatch touched move");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("ButtonTouch","dispatch touched up");
                break;
        }

        return super.dispatchTouchEvent(event);
    }






}
