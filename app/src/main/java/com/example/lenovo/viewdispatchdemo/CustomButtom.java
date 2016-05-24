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
        Log.e("ButtonTouch","touched");
        return false;
    }

}
