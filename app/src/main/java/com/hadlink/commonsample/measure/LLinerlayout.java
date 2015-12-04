package com.hadlink.commonsample.measure;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;

/**
 * @author Created by lyao on 2015/12/3.
 * @update
 * @description
 */
public class LLinerlayout extends LinearLayout {

    public LLinerlayout(Context context) {
        super(context);
    }

    public LLinerlayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LLinerlayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d("LLinerlayout", "width " + getMode(MeasureSpec.getMode(widthMeasureSpec)) + " " + MeasureSpec.getSize(widthMeasureSpec));
        Log.d("LLinerlayout", "height " +getMode(MeasureSpec.getMode(heightMeasureSpec)) + " " + MeasureSpec.getSize(heightMeasureSpec));
    }

    public String getMode(int i) {
        switch (i) {
            case MeasureSpec.AT_MOST:
                return "AT_MOST";
            case MeasureSpec.EXACTLY:
                return "EXACTLY";
            case MeasureSpec.UNSPECIFIED:
                return "UNSPECIFIED";
        }
        return "";
    }

    @Override protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }
}
